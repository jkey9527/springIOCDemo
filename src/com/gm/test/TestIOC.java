package com.gm.test;


import com.gm.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {

    @Test
    public void test(){
        //使用ApplicationContext获取对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) ac.getBean("user1");
        user.hello();
    }

    @Test
    public void test2(){
        //使用ApplicationContext获取对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) ac.getBean("user2");
        user.hello();
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getDog().getName());
    }
}
