package com.example.demo.Service;


import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();
    void saveUser(User user);
    void removeUser(int id);
    User getUserById(int id);
    void update(int id, User user);
}
