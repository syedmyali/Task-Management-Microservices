package com.syed.service;

import com.syed.configuration.JwtProvider;
import com.syed.model.User;
import com.syed.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User getUserProfile(String jwt) {
        String email = JwtProvider.getEmailFromToken(jwt);
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> getAllUsers(String jwt) {
        return userRepository.findAll();
    }
}
