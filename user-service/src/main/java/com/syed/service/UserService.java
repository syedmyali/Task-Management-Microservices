package com.syed.service;

import com.syed.model.User;

import java.util.List;


public interface UserService {

    public User getUserProfile(String jwt);
    public List<User> getAllUsers(String jwt);
}
