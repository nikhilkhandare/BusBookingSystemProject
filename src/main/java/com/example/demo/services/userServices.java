package com.example.demo.services;

import com.example.demo.entities.users;
import org.springframework.stereotype.Service;

import java.util.List;

public interface userServices {
    public List<users> getusers();
    public users getuser(long id);

    public users adduser(users user);

    public users updateUser(users user);

    public users deleteUser(long parseLong);
}
