package com.bovino.cdcdemoclient.controller;

import com.bovino.cdcdemoclient.domain.User;
import com.bovino.cdcdemoclient.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserIntegrationController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/user")
    public List<User> getAllUsers(){
        return userClient.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Integer id){
        return userClient.getUserById(id);
    }

    @PostMapping("/user")
    public User saveNewUser(@RequestBody User user){
        return userClient.saveNewUser(user);
    }
}

