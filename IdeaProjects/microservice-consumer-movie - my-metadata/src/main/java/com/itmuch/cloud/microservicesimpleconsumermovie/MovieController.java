package com.itmuch.cloud.microservicesimpleconsumermovie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController

public class MovieController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;



    @GetMapping(value = "/user/{id}")
    public User findById(@PathVariable int id){
        return this.restTemplate.getForObject("http://localhost:8000/"+id,User.class);

    }

    /**
     * 查询microservice-provider-user服务信息并返回
     * @return microservice-provider-user的服务信息
     */
    @GetMapping("/user-instance")
    public List<ServiceInstance> showInfo(){
        return this.discoveryClient.getInstances("microservice-provider-user");
    }
}
