package com.wang.test.dao;

import com.wang.test.entities.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    int insert(User user);
    int batchInsert(List<User> userList);

    int update(User user);

    int delete(@Param("user") User user);

    User selectById(int id);

    List<User> selectAll();
}
