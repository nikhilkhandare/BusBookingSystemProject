package com.example.demo.services;

import com.example.demo.entities.ticket;
import com.example.demo.entities.users;

import java.util.List;

public interface ticketServices {
    public List<ticket> getTickets();

    public ticket getTickets(long id);
    ticket addTickets(ticket user_ticket);

    ticket updateTickets(ticket user_ticket);

    public ticket deleteTicket(long parseLong);
}
