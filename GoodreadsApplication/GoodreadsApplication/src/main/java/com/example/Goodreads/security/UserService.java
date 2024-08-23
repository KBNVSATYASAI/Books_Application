/* 
package com.example.Goodreads.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public ResponseEntity<?> registerUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            return ResponseEntity.badRequest().body("Email is already in use!");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return ResponseEntity.ok("User registered successfully");
    }

    public ResponseEntity<?> authenticateUser(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isPresent() && passwordEncoder.matches(password, user.get().getPassword())) {
            return ResponseEntity.ok("User authenticated successfully");
        }
        return ResponseEntity.status(401).body("Invalid email or password");
    }
}
*/



//poweer
/*
package com.example.Goodreads.security;

 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public ResponseEntity<?> registerUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            return ResponseEntity.badRequest().body("Email is already in use!");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return ResponseEntity.ok("User registered successfully");
    }

    public ResponseEntity<?> authenticateUser(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isPresent() && passwordEncoder.matches(password, user.get().getPassword())) {
            return ResponseEntity.ok("User authenticated successfully");
        }
        return ResponseEntity.status(401).body("Invalid email or password");
    }
}
*/


package com.example.Goodreads.security;

 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public ResponseEntity<?> registerUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            return ResponseEntity.badRequest().body("Email is already in use!");
        }

        // Debug: Print user password before encoding
        System.out.println("Password before encoding: " + user.getPassword());

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Debug: Print user password after encoding
        System.out.println("Password after encoding: " + user.getPassword());

        userRepository.save(user);
        return ResponseEntity.ok("User registered successfully");
    }

    public ResponseEntity<?> authenticateUser(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isPresent() && passwordEncoder.matches(password, user.get().getPassword())) {
            return ResponseEntity.ok("User authenticated successfully");
        }
        return ResponseEntity.status(401).body("Invalid email or password");
    }
}
