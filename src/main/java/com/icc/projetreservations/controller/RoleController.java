package com.icc.projetreservations.controller;

import com.icc.projetreservations.model.Role;
import com.icc.projetreservations.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/role")
public class RoleController {

    @Autowired
    RoleService rs;

    @PostMapping(value = "/create")
    public Role createRole(@RequestBody Role role){
        return rs.createRole(role);
    }


}
