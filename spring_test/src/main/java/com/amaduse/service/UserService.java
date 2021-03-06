package com.amaduse.service;

import com.amaduse.dao.UserDao;
import com.amaduse.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserDao userRepository;

    public User findUserByName(String name){
        return userRepository.findUserByName(name);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

}
