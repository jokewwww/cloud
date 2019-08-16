package com.joker.controller;


import com.joker.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired private RestTemplate restTemplate;

    @Autowired private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/get/{id}")
    public User get(@PathVariable Long id){
        return restTemplate.getForObject("http://user-provider/find/"+id,User.class);
    }

    @RequestMapping("test")
    public String test(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("user-provider");
        System.out.println(serviceInstance.getHost()+":"+serviceInstance.getPort()+":"+serviceInstance.getServiceId());
        return "success";
    }
}
