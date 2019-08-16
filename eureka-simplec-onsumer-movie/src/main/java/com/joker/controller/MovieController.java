package com.joker.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.joker.entity.User;

@RestController
public class MovieController {


    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/get/{id}")
    public User get(@PathVariable Long id){
        return restTemplate.getForObject("http://user-provider:7900/find/"+id,User.class);
    }
}
