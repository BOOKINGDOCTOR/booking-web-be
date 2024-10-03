package com.example.bookingserver.domain.repository;

import com.example.bookingserver.domain.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository{
    User save(User user);
    Optional<User> findById(String id);
    Optional<User> findByPhoneNumber(String phoneNumber);
    Optional<User> signIn(String phoneNumber, String password);
    void delete(String id);
    boolean isPhoneNumberExisted(String phoneNumber);
}
