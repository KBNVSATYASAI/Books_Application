/*package com.example.Goodreads.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@RequestParam String email, @RequestParam String password) {
        return userService.authenticateUser(email, password);
    }
}*/


package com.example.Goodreads.security;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String email, @RequestParam String password) {
        return userService.authenticateUser(email, password);
    }

   

}

