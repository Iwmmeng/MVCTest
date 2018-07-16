package com.wang.test.service;

import com.wang.test.entities.User;

import java.util.List;

public interface UserService {
    int insert(User user);
    int batchInsert(List<User> userList);

    int update(User user);

    int delete(User user);

    User selectById(int id);

    List<User> selectAll();
}
