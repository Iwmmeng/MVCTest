package com.wang.test.service;

import com.wang.test.dao.UserDao;
import com.wang.test.entities.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public int insert(User user) {
        if (StringUtils.isBlank(user.getPassWord())){
            return -1;
        }
        return userDao.insert(user);
    }

    @Override
    public int batchInsert(List<User> userList) {
        return 0;
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int delete(User user) {
        return userDao.delete(user);
    }

    @Override
    public User selectById(int id) {
        return userDao.selectById(id);
    }

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }
}
