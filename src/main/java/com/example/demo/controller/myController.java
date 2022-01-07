package com.example.demo.controller;

import com.example.demo.entities.users;
import com.example.demo.services.userServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class myController {
   @Autowired
   private userServices userservice;

    @CrossOrigin(origins = "http://localhost:4200")
   @GetMapping("/users")
    public List<users> getusers()
    {
        return this.userservice.getusers();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/users/{id}")
    public users getuser(@PathVariable String id){

//        try {
//            this.userservice.getuser(Long.parseLong(id));
//            return new ResponseEntity<>(HttpStatus.OK);
//        }
//        catch (Exception e)
//        {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
        return this.userservice.getuser(Long.parseLong(id));
    }

    @PostMapping("/users")
    public users addUser(@RequestBody users user)
    {
        return this.userservice.adduser(user);
    }

    @PutMapping("/users")
    public users updateUser(@RequestBody users user)
    {
        return this.userservice.updateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable String id){
        try {
            this.userservice.deleteUser(Long.parseLong(id));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
