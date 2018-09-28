package com.example.seversecurity.dao;


import com.example.seversecurity.entity.SysUser;
import com.example.seversecurity.entity.User;

import java.util.List;

public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getAllUsers();

    public SysUser findByUserName(String username);

}
