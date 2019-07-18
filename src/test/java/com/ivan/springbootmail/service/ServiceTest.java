package com.ivan.springbootmail.service;


import com.ivan.springbootmail.hello.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

    @Resource
    MailService mailService;


    @Test
    public void sayHelloTest(){
        mailService.sayHello();
    }


    @Test
    public void sendSimpleMailTest(){
        mailService.sendSimpleMail("ivanzhong0310@gmail.com","Test Email ","This is a test email!");
    }
}
