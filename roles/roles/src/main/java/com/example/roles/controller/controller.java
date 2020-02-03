package com.example.roles.controller;
import com.example.roles.model.tables.pojos.Roles;
import com.example.roles.model.tables.pojos.Users;
import com.example.roles.repository.RefRepository;
import com.example.roles.validator.UserRoleFetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class controller {

    @Autowired
    private RefRepository refRepository;

    @GetMapping("/users")
    public List<Users> getDetails(){
        return refRepository.users();
    }
    @GetMapping("/roles/{id}")
    public Roles roles(@PathVariable Integer id){
        System.out.println("bb" + refRepository.getRole(id) + "dd");
        return refRepository.getRole(id);
    }
    @GetMapping("/users/{id}")
    public UserRoleFetch userRoleFetch(@PathVariable Integer id){
        return refRepository.getUserRole(id);
    }
    @PostMapping("/roles/{id}")
    public String addRecords(@RequestBody Roles roles, @PathVariable Integer id){
        refRepository.addRecords(roles,id);
        return "updated";
    }
    @PostMapping("/post/{id}")
    public String addUsers(@RequestBody Users users, @PathVariable Integer id) {
       refRepository.addUsers(users,id);
        return "updated";
    }
    @PutMapping("/update/{id}")
    public void updateRecords(@RequestBody Roles roles,@PathVariable Integer id){
        refRepository.updateRecords(roles,id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id,@RequestBody Users users){
        refRepository.delete(users, id);
    }
}
