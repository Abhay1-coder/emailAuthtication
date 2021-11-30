package com.bookapi.book.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class authemail {
        @Autowired
        private JavaMailSender emailSender;
        @GetMapping("/send")
        public String sendSimpleMessage() {
            SimpleMailMessage message = new SimpleMailMessage(); //inbuild class
           // message.setFrom("noreply@baeldung.com");
            message.setTo("abhaypdk123@gmail.com"); 
            message.setSubject("test from spring boot"); 
            message.setText("Hello");
            
            try{
                emailSender.send(message);
                return "sucessfully send";

            } catch(Exception e ){
                return e.getMessage();
            }
        
        }
    }

