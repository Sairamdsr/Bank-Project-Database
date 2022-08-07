package com.user.validate.user.service;

import com.user.validate.user.model.Customers;
import com.user.validate.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public Customers fetchUser(String id) {

        return userRepository.findById(id).get();

    }
}
