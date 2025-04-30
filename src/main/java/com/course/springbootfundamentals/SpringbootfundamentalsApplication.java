package com.course.springbootfundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootfundamentalsApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringbootfundamentalsApplication.class, args);
        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
