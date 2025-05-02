package com.course.springbootfundamentals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService {
    @Value("${email.host:outlook}")
    private String host;

    @Value("${email.port:1000}")
    private int port;

    @Override
    public void send(String messageText, String recipient) {
        System.out.println("Email: " + messageText + " to " + recipient + " via " + host + ":" + port);
    }
}
