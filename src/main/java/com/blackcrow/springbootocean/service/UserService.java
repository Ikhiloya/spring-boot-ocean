package com.blackcrow.springbootocean.service;

import com.blackcrow.springbootocean.domain.User;
import com.blackcrow.springbootocean.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
   private UserRepository userRepository;
    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
