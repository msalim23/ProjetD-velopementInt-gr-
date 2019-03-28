package com.icc.projetreservations.service;

import com.icc.projetreservations.model.User;
import com.icc.projetreservations.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository ur;

    public User getUserById(int id){
        return ur.findById(id).get();
    }

    public List<User> getAllUser(){
        return ur.findAll();
    }

    public User createUser(User user){
        ur.save(user);
        return user;
    }

    public User updateUserById(int id, User user){
        User userToUpdate = ur.findById(id).get();

        userToUpdate.setLogin(user.getLogin());
        userToUpdate.setPassword(user.getPassword());
        userToUpdate.setFirstname(user.getFirstname());
        userToUpdate.setLastname(user.getLastname());
        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setLangue(user.getLangue());

        ur.save(userToUpdate);

        return userToUpdate;
    }
}
