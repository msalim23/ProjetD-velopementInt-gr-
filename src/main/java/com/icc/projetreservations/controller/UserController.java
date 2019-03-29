package com.icc.projetreservations.controller;

import com.icc.projetreservations.model.Role;
import com.icc.projetreservations.model.User;
import com.icc.projetreservations.service.RoleService;
import com.icc.projetreservations.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService us;

    @Autowired
    RoleService rs;


    @PostMapping(value = "/create")
    public User createUser(@RequestBody User user){

        return us.createUser(user);

    }


    @PutMapping("/addRole/{idUser}/{idRole}")
    public User addRoleToUser(@PathVariable int idUser, @PathVariable int idRole){
        Role roleToPut = rs.getRoleById(idRole);
        User userToEdit = us.getUserById(idUser);

        userToEdit.setRole(roleToPut);
        us.createUser(userToEdit);

        return userToEdit;
    }

    @GetMapping(value = "/getAll")
    public List<User> getAllUsers (){
        return us.getAllUser();
    }

}
