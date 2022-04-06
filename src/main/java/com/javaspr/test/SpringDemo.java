package com.javaspr.test;


import com.javaspr.bean.PaymentGateway;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

    public static void main(String a[]) {
        String confFile = "applicationContext.xml";
        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext(confFile);
        PaymentGateway gateway = (PaymentGateway) context.getBean("paymentGateway");
        gateway.processOrder();
    }
}