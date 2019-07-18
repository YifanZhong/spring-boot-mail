package com.ivan.springbootmail.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.mail.MessagingException;

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

    @Test
    public void sendHtmlMailTest() throws MessagingException {
        String content = "<html>\n"+
                        "<body>\n"+
                        "<h3>This is Html test email.</h3>"+
                        "</body>\n"+
                        "</html>";

        mailService.sendHtmlMail("ivanzhong0310@gmail.com","Html Test Mail", content);
    }
}
