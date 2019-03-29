package com.icc.projetreservations.controller;

import com.icc.projetreservations.model.LoginInfo;
import com.icc.projetreservations.model.User;
import com.icc.projetreservations.service.RoleService;
import com.icc.projetreservations.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserService us;

    @Autowired
    RoleService rs;

    @PostMapping(value = "/login")
    public User loginUser(@RequestBody LoginInfo loginInfo) throws Exception {
        User user = us.loginUser(loginInfo.getLogin(),loginInfo.getPassword());

        if (user == null){
            throw new Exception();
        }else{
            return user;
        }
    }
}
