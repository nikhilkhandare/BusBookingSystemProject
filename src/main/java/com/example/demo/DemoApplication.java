package com.example.demo;

import com.example.demo.dao.customerRepository;
import com.example.demo.entities.customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
//@ComponentScan("com.example.demo.services.loginServices")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
