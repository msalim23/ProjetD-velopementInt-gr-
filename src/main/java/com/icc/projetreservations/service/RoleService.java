package com.icc.projetreservations.service;

import com.icc.projetreservations.model.Role;
import com.icc.projetreservations.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    RoleRepository rr;


    public Role createRole(Role role){
        rr.save(role);

        return role;
    }

    public Role getRoleById(int id){
        return rr.findById(id).get();
    }

    public Role deleteRoleById(int id){

        Role r = rr.findById(id).get();
        rr.delete(r);

        return r;
    }

}
