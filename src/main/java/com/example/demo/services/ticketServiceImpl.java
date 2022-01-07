package com.example.demo.services;


import com.example.demo.dao.ticketDao;
import com.example.demo.dao.userDao;
import com.example.demo.entities.ticket;
import com.example.demo.entities.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ticketServiceImpl implements ticketServices{
    @Autowired
    private ticketDao ticketDao;
//    List<ticket> list;

    public ticketServiceImpl()
    {
//        list=new ArrayList<>();
//        list.add(new ticket(1,"shivneri",1,"10/10/2011","10am","200","pune","mumbai",50,20));
//        list.add(new ticket(2,"shivshahi",2,"10/10/2011","10am","200","pune","mumbai",50,20));

    }



    @Override
    public List<ticket> getTickets() {
        return ticketDao.findAll();
    }

    @Override
    public ticket getTickets(long id) {
        ticket entity = ticketDao.findById(id).get();
        return entity;
    }

    @Override
    public ticket addTickets(ticket user_ticket) {
        System.out.println("key : "+user_ticket);
        ticketDao.save(user_ticket);
        return user_ticket;
    }

    @Override
    public ticket updateTickets(ticket user_ticket) {
        ticketDao.save(user_ticket);
        return user_ticket;
    }

    @Override
    public ticket deleteTicket(long parseLong) {
        ticket entity = ticketDao.getOne(parseLong);
        ticketDao.delete(entity);
        return entity;
    }

}
