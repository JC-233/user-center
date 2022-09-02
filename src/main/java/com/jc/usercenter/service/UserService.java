package com.jc.usercenter.service;

import com.jc.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author JC
 * 用户服务
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2022-08-31 13:16:47
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return
     */
    User doLogin(String userAccount, String userPassword, HttpServletRequest httpServletRequest);
}
