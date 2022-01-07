package com.example.demo.services;

import com.example.demo.dao.userDao;
import com.example.demo.entities.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userServices{

    @Autowired
    private userDao userDao;
//    List<users> list;

    public  userServiceImpl()
    {
//        list = new ArrayList<>();
//        list.add(new users(1,"Nikhil","male","7744820015","24","nikhil@gmail.com","9845486"));
//        list.add(new users(2,"John","James","7744820018","27","john@gmail.com","12565456"));
//        list.add(new users(3,"Reeya","female","7744820016","26","reeya@gmail.com","123456"));

    }

    @Override
    public List<users> getusers() {
        return userDao.findAll();
    }

    @Override
    public users getuser(long parseLong)
    {
        users entity = userDao.findById(parseLong).get();
        return entity;
//        return userDao.getById(id);
    }

    @Override
    public users adduser(users user) {
        userDao.save(user);
        return user;
    }

    @Override
    public users updateUser(users user) {
        userDao.save(user);
        return user;
    }

    @Override
    public users deleteUser(long parseLong) {
        users entity = userDao.getOne(parseLong);
        userDao.delete(entity);
        return entity;
    }

}
