package com.example.springcorexml2;

import beans.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreXml2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreXml2Application.class, args);
        ApplicationContext context= new ClassPathXmlApplicationContext("SpringBeans.xml");
//        Student obj =(Student) context.getBean("student");
//        obj=(Student) context.getBean("userDao");
//        System.out.println(obj);
        context.getBean("student");
        context.getBean("student");
        context.getBean("student");
        context.getBean("student");

    }

}
