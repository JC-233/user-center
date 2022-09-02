package com.jc.usercenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@MapperScan("com.jc.usercenter.mapper")
public class UserCenterApplication {

    public static void main(String[] args) {
        Date time = new Date();
        SpringApplication.run(UserCenterApplication.class, args);
        long startTime = new Date().getTime() - time.getTime();
        System.out.println("启动时间：" + startTime + "ms");
    }

}
