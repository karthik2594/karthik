package com.rsa.rsaApplication.repository;

import com.rsa.rsaApplication.model.tables.pojos.Users;
import com.rsa.rsaApplication.service.RsaService;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import static com.rsa.rsaApplication.model.Tables.PRI_KEY;
import static com.rsa.rsaApplication.model.Tables.PUB_KEY;
import static com.rsa.rsaApplication.model.tables.Users.USERS;

@Repository
public class RsaRepository {

    private RsaService rsaService;

    private final DSLContext db;

    public RsaRepository(DSLContext db) {
        this.db = db;
    }

    public List<Users> users(){
        return db.selectFrom(USERS)
                .fetchInto(Users.class);
    }

    public String model(Integer id, String message) throws NoSuchAlgorithmException {
        var result=rsaService.model(message) ;
        db.insertInto(PUB_KEY,PUB_KEY.PUB_KEY_,PUB_KEY.USR_ID)
                .values(result.getPubkey(),id).execute();
        return "Successfull";
    }

    public String modelPri(Integer id, String message) throws NoSuchAlgorithmException {
        var priResult=rsaService.model(message) ;
        db.insertInto(PRI_KEY,PRI_KEY.PRI_KEY_,PRI_KEY.USR_ID)
                .values(priResult.getPrikey(),id).execute();
        return "Successfull";
    }
}
