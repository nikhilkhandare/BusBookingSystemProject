package com.example.demo.controller;

import com.example.demo.dao.customerRepository;
import com.example.demo.entities.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class customerController {
    @Autowired
    private customerRepository customerservice;

    @GetMapping("/customerdetails")
    public List<customer> getdetails()
    {
        return this.customerservice.getdetails();
    }
}
