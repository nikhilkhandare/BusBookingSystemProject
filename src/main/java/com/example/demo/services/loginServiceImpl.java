//package com.example.demo.services;
//
//import com.example.demo.dao.loginDao;
//import com.example.demo.entities.login;
//
//import java.util.List;
//
//public class loginServiceImpl implements loginServices {
//
//    private loginDao loginDao;
//
//    public loginServiceImpl()
//    {
//
//    }
//
//    @Override
//    public List<login> getlogin() {
//        return loginDao.findAll();
//    }
//
//    @Override
//    public login loginuser(login login) {
//        loginDao.save(login);
//        return login;
//    }
//
//    @Override
//    public login getlogins(long parseLong) {
//        login entity = loginDao.findById(parseLong).get();
//        return entity;
//    }
//
//    @Override
//    public login updateLogin(login login) {
//        loginDao.save(login);
//        return login;
//    }
//
//    @Override
//    public login deleteLogin(long parseLong) {
//        login entity = loginDao.getOne(parseLong);
//        loginDao.delete(entity);
//        return entity;
//    }
//
//
//}
//
//
