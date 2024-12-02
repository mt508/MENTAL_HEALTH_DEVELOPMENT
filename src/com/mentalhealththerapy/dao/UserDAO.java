package com.mentalhealththerapy.dao;
import com.mentalhealththerapy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
    // Custom query methods can be added here

    // Find user by email
    User findByEmail(String email);

    // Find user by name
    List<User> findByName(String name);

    // Find user by phone number
    User findByPhoneNumber(String phoneNumber);
}
