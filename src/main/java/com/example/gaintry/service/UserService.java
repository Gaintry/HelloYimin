package com.example.gaintry.service;

import com.example.gaintry.entity.User;
import com.example.gaintry.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getUserById(int id)
    {
       return userMapper.getUser(id);
    }


    public List<User> getAll()
    {
        return  userMapper.getAll();
    }

    public  int insertUser(User user)
    {
        userMapper.insertUser(user);
        return  1;
    }
}
