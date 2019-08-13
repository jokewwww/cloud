package com.joker.controller;


import com.joker.entity.User;
import com.joker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired private UserRepository userRepository;

    @RequestMapping("find/{id}")
    public User findByid(@PathVariable Long id){
        return userRepository.findById(id).get();
    }
}
