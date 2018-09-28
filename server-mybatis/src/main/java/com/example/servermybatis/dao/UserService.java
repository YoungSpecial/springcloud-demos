package com.example.servermybatis.dao;

import com.example.servermybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  {

    @Autowired
    private UserDao userDao;

    public int addUser(User user){
        return userDao.insert(user);
    }

    public User getUserById(int id){
        return userDao.selectByPrimaryKey(id);
    }

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

}
