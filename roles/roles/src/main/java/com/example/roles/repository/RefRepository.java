package com.example.roles.repository;

import com.example.roles.model.tables.pojos.Roles;
import com.example.roles.model.tables.pojos.Users;
import com.example.roles.validator.UserRoleFetch;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import static com.example.roles.model.tables.RefDetails.REF_DETAILS;
import static com.example.roles.model.tables.Roles.ROLES;
import static com.example.roles.model.tables.Users.USERS;


@Repository
public class RefRepository {

    private final DSLContext db;

    public RefRepository(DSLContext db) {
        this.db = db;
    }

    public List<Users> users(){
        return db.selectFrom(USERS)
                .fetchInto(Users.class);
    }

    public Roles getRole(Integer id) {
     return db.select()
             .from(REF_DETAILS)
             .join(ROLES)
             .on(ROLES.ROLE_ID.eq(REF_DETAILS.ROL_ID))
             .where(ROLES.ROLE_ID.eq(id))
             .fetchOneInto(Roles.class);
    }

   public UserRoleFetch getUserRole(Integer id){
        Users users = db.selectFrom(USERS).where(USERS.USER_ID.eq(id))
                .fetchOneInto(Users.class);
        List<Roles> roles = db.select(ROLES.ROLE_ID,ROLES.ROLE)
                .from(ROLES)
                .join(REF_DETAILS)
                .on(REF_DETAILS.USE_ID.eq(id))
                .where(ROLES.ROLE_ID.eq(REF_DETAILS.ROL_ID))
                .fetchInto(Roles.class);
        return new UserRoleFetch(users.getUserId(),users.getFirstName(),users.getLastName(),
                users.getMail(),users.getPassword(),roles);
   }

    public void addRecords(Roles roles, Integer id) {
        db.insertInto(ROLES, ROLES.ROLE,ROLES.ROLE_ID)
                .values(roles.getRole(),roles.getRoleId())
                .execute();
        db.insertInto(REF_DETAILS, REF_DETAILS.USE_ID, REF_DETAILS.ROL_ID)
                .values(id,roles.getRoleId())
                .execute();
    }

    public void addUsers(Users users,Integer id){
        db.insertInto(USERS,USERS.USER_ID,USERS.FIRST_NAME,USERS.LAST_NAME,USERS.MAIL,USERS.PASSWORD)
                .values(users.getUserId(),users.getFirstName(),users.getLastName(),users.getMail(),users.getPassword())
                .execute();
        db.insertInto(REF_DETAILS,REF_DETAILS.USE_ID,REF_DETAILS.ROL_ID)
                .values(id,users.getUserId())
                .execute();
    }

    public void updateRecords(Roles roles, Integer id) {
        db.update(ROLES)
                .set(ROLES.ROLE,roles.getRole())
                .set(ROLES.ROLE_ID, roles.getRoleId())
                .where(ROLES.ROLE_ID.eq(id))
                .execute();
    }

    public void delete(Users users,Integer id) {
        db.delete(REF_DETAILS)
                .where(REF_DETAILS.ROL_ID.eq(id))
                .execute();
        db.delete(USERS)
                .where(USERS.USER_ID.eq(id))
                .execute();

    }
}














