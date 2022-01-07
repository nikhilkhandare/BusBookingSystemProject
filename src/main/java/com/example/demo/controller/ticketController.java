package com.example.demo.controller;

import com.example.demo.entities.ticket;
import com.example.demo.entities.users;
import com.example.demo.services.ticketServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ticketController {
    @Autowired
    private ticketServices ticketSerivice;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/tickets")
    public List<ticket> getTickets()
    {
        return this.ticketSerivice.getTickets();
    }

    @GetMapping("/tickets/{id}")
    public ticket getTickets(@PathVariable String id)
    {
        return this.ticketSerivice.getTickets(Long.parseLong(id));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/tickets")
    public ticket addUser(@RequestBody ticket user_ticket)
    {
        System.out.println("Controller msg "+user_ticket);
        return this.ticketSerivice.addTickets(user_ticket);
    }

    @PutMapping("/tickets")
    public ticket updateUser(@RequestBody ticket user_ticket)
    {
        return this.ticketSerivice.updateTickets(user_ticket);
    }

    @DeleteMapping("/tickets/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable String id){
        try {
            this.ticketSerivice.deleteTicket(Long.parseLong(id));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
