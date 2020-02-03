package com.example.roles.validator;


import com.example.roles.model.tables.pojos.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleFetch {

    private Integer user_id;
    @NotBlank(message = "First Name is mandatory")
    private String first_name;
    private String last_name;
    private String mail;
    private String password;


    private List<Roles> roles;
}
//    public UserRoleFetch() {
//    }
//
//    public UserRoleFetch(Integer user_id, String first_name, String last_name, String mail, String password, List<Roles> roles) {
//        this.user_id = user_id;
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.mail = mail;
//        this.password = password;
//        this.roles = roles;
//    }
//
//    public UserRoleFetch(String firstName, String lastName, String mail, String password, Integer userId, List<Roles> roles) {
//    }
//
//    public Integer getUser_id() {
//        return user_id;
//    }
//
//    public void setUser_id(Integer user_id) {
//        this.user_id = user_id;
//    }
//
//    public String getFirst_name() {
//        return first_name;
//    }
//
//    public void setFirst_name(String first_name) {
//        this.first_name = first_name;
//    }
//
//    public String getLast_name() {
//        return last_name;
//    }
//
//    public void setLast_name(String last_name) {
//        this.last_name = last_name;
//    }
//
//    public String getMail() {
//        return mail;
//    }
//
//    public void setMail(String mail) {
//        this.mail = mail;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public List<Roles> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<Roles> roles) {
//        this.roles = roles;
//    }
