package com.jc.usercenter.service;
import java.util.Date;

import com.jc.usercenter.mapper.UserMapper;
import com.jc.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * Create by jc on 2022/9/2 0:55
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;
    @Resource
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = new User();
        user.setUsername("jcjcjc");
        user.setUserAccount("xiaojc");
        user.setAvatarUrl("url------");
        user.setUserPassword("233333");
        user.setGender(0);
        int insert = userMapper.insert(user);
        Assertions.assertEquals(1, insert);
    }

    @Test
    void userRegister() {
        String userAccount = "jcjc";
        String userPassword = "";
        String checkPassword = "123123";
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        userAccount = "123";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        userPassword = "123456";
        checkPassword = "1234567";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        userAccount = "xiaojc";
        userPassword = "12345679";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        userAccount = "xiaojc  ";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        userAccount = "xiaojc111";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
    }
}
