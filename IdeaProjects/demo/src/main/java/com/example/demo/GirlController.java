package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GirlController{
    @Autowired
    private GirlRepository girlRepository;
    @RequestMapping (value = "/girl",method = RequestMethod.GET)
    public List<Girl> say(){
        return girlRepository.findAll();
    }
}
