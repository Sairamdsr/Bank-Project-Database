package com.user.validate.user.controller;

import com.user.validate.user.model.Customers;
import com.user.validate.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser/{id}")
    public Customers getUser(@PathVariable("id") String id) {

        try {
            return userService.fetchUser(id);
        } catch (Exception e) {
            return null;
        }

    }
}
