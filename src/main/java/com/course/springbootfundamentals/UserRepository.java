package com.course.springbootfundamentals;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
