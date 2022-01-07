package com.example.demo.dao;

import com.example.demo.entities.ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ticketDao extends JpaRepository<ticket,Long> {
}
