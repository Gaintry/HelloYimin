package com.example.gaintry.mapper;

import com.example.gaintry.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    User getUser(int id);

    List<User> getAll();

    int insertUser(User user);

    int deleteUser(int id);

    int UpdateUser(User user);
}
