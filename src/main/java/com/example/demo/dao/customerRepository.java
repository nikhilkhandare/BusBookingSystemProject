package com.example.demo.dao;

import com.example.demo.entities.customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface customerRepository extends CrudRepository<customer,Integer> {
    @Query(value = "select users.user_name, users.gender,users.mobile,users.age,users.email,booked_ticket.busname, booked_ticket.busno,booked_ticket.date,booked_ticket.destination,booked_ticket.source,booked_ticket.price,booked_ticket.time from users INNER JOIN booked_ticket on users.user_id=booked_ticket.user_id;  ",nativeQuery = true)
    public List<customer> getdetails();
}
