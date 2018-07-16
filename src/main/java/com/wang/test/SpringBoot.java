package com.wang.test;

import com.wang.test.dao.UserDao;
import com.wang.test.entities.User;
import com.wang.test.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringBoot {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-base.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        User user = new User();

        UserService userService = applicationContext.getBean(UserService.class);;
//        user.setUserName("wangdasha");
//        user.setPassWord("123455");
//        userService.insert(user);
//        user.setUserName("wwwww");
//        user.setPassWord("222222");
//        userService.insert(user);
//
//        System.out.println("1=======");
//        userService.selectAll();
//        System.out.println("2========");

//        User user1=userService.selectById(3);
       List<User> user2=userDao.selectAll();
        System.out.println("3========="+user2);





    }
}
