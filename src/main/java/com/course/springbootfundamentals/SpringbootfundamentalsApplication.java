package com.course.springbootfundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootfundamentalsApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringbootfundamentalsApplication.class, args);
//        OrderService orderService = applicationContext.getBean(OrderService.class);
//        orderService.placeOrder();
//        NotificationManager notificationManager = applicationContext.getBean(NotificationManager.class);
//        notificationManager.sendMessage("Text Body");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.registerUser(new User(1L,"John","john@hotmail.com","1234"));
//        userService.registerUser(new User(1L,"John","john@hotmail.com","1234"));
        userService.registerUser(new User(2L,"Peter","peter@hotmail.com","5678"));
    }

}
