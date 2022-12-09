package com.example.demo.dao;


import com.example.demo.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUserList();

    void saveUser(User user);

    void removeUser(int id);

    User getUserById(int id);

    void update(int id, User user);
}
