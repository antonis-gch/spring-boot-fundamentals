package com.course.springbootfundamentals;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private final NotificationService notificationService;

    public NotificationManager(@Qualifier("email") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendMessage(String messageText, String recipient){
        notificationService.send(messageText,recipient);
    }
}
