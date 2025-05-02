package com.course.springbootfundamentals;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, @Qualifier("email") NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("User with email: " + user.getEmail() + " already exists");
        }

        userRepository.save(user);
        notificationService.send("Welcome to our service", user.getEmail());
    }

}
