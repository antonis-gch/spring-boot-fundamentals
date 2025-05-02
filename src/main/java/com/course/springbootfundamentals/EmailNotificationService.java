package com.course.springbootfundamentals;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String messageText) {
        System.out.println("Email: " + messageText);
    }
}
