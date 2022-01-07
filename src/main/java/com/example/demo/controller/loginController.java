//package com.example.demo.controller;
//
//import com.example.demo.entities.login;
//import com.example.demo.services.loginServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class loginController {
//
//    @Autowired
//    private loginServices loginservice;
//
//    @GetMapping("/login")
//    public List<login> getlogin()
//    {
//        return this.loginservice.getlogin();
//    }
//
//    @GetMapping("/login/{id}")
//    public login getlogin(@PathVariable String id)
//    {
//        return this.loginservice.getlogins(Long.parseLong(id));
//    }
//
//    @PostMapping("/login")
//    public login loginUser(@RequestBody login login)
//    {
//        return this.loginservice.loginuser(login);
//    }
//
//    @PutMapping("/login")
//    public login updateLogin(@RequestBody login login)
//    {
//        return this.loginservice.updateLogin(login);
//    }
//
//    @DeleteMapping("/user/{id}")
//    public ResponseEntity<HttpStatus> deleteLogin(@PathVariable String id)
//    {
//        try {
//            this.loginservice.deleteLogin(Long.parseLong(id));
//            return new ResponseEntity<>(HttpStatus.OK);
//        }
//        catch (Exception e)
//        {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//}
