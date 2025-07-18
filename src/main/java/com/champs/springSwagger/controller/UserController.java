package com.champs.springSwagger.controller;

import com.champs.springSwagger.model.User;
import com.champs.springSwagger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{username}")
    public User getOneUser(@PathVariable("username") String username) {
        return userRepository.findByName(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }
    @PostMapping
    public User createUser(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }
    @PutMapping
    public User updateUser(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }
}
