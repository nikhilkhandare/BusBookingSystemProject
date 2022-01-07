package com.example.demo.dao;

import com.example.demo.entities.users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userDao extends JpaRepository<users,Long> {



}
