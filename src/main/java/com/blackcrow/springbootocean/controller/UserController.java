package com.blackcrow.springbootocean.controller;

import com.blackcrow.springbootocean.domain.User;
import com.blackcrow.springbootocean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    private final Environment environment;

    public UserController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/message")
    public String getMessage() {
        String name = environment.getProperty("Name");
        return "Welcome to Black Crow Enterprise " + name;
    }


    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable("id") Long id) {
        return userService.findById(id);
    }


//    @GetMapping("/message")
//    public String getMessage(){
//        return "hello Digital ocean, I am Spring Boot";
//    }

    @PostMapping
    public User getUser(@RequestBody User user) {
        return userService.save(user);
    }
}
