package com.itmuch.cloud.microservicesimpleprovideruser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping(value = "/{id}")
    public User findById(@PathVariable int id){
        User findOne=this.userRepository.findById(id).get();
        return findOne;
    }
}