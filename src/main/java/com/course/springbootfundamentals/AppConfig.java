package com.course.springbootfundamentals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Value("${payments.processor:stripe}")
    private String paymentProcessor;

    @Bean
    // name of functions is the name of the bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal(){
        return new PayPalPaymentService();
    }

    @Bean
//    @Scope("prototype")
    public OrderService orderService(){
        return new OrderService(paymentProcessor.equals("stripe")?stripe():paypal());
    }
}
