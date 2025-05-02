package com.course.springbootfundamentals;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private final HashMap<String, User> users = new HashMap<>();

    //    @Override
//    public void save(User user){
//        if (!users.containsKey(user.getEmail())) {
//            users.put(user.getEmail(), user);
//            System.out.println("User saved: " + user.getEmail());
//        }
//        else
//            System.out.println("User already exists: " + user.getEmail());
//    }
    @Override
    public void save(User user) {
        users.put(user.getEmail(), user);
        System.out.println("User saved: " + user.getEmail());
    }

    @Override
    public User findByEmail(String email) {
        return users.getOrDefault(email, null);
    }
}
