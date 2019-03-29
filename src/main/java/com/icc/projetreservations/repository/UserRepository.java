package com.icc.projetreservations.repository;

import com.icc.projetreservations.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserByLoginAndPassword(String login, String Password);
}
