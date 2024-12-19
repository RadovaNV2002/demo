package com.example.demo.service;


import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User readUser(long id);

    User deleteUser(long parseUnsignedInt);

    void createOrUpdateUser(User user);

    void createUser(User user);

    void updateUser(User user);
}
