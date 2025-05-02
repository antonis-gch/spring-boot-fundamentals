package com.course.springbootfundamentals;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
@Primary
public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String messageText, String recipient) {
        System.out.println("SMS: " + messageText + " to " + recipient);
    }
}
