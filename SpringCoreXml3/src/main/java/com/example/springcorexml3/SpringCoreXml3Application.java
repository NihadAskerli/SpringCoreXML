package com.example.springcorexml3;

import az.company.customer.services.CustomerService;
import az.company.customer.services.inter.ICustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreXml3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreXml3Application.class, args);
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"Spring-AutoScan.xml"});
        ICustomerService cust=(ICustomerService) context.getBean("customerService");
//        System.out.println(cust);
        System.out.println(cust.getUsers());
    }


}
