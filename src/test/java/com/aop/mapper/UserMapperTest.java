package com.aop.mapper;

import com.aop.entity.User;
import com.aop.service.impl.UserServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;

/**
 * @author Cjl
 * @date 2021/7/8 20:32
 */

public class UserMapperTest {

    @Test
    public void tranfer(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserServiceImpl userService = ioc.getBean(UserServiceImpl.class);
        Integer update = userService.updateBalance(2, 2, 4000);
        System.out.println(update);

    }
}
