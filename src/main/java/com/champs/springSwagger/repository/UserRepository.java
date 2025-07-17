package com.champs.springSwagger.repository;

import com.champs.springSwagger.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user){
        if(user.getId() ==null){
            System.out.println("Saving new user: " + user);
        } else {
            System.out.println("Updating user with ID " + user.getId() + ": " + user);
        }
    }
    public void deleteById(Integer id){
        System.out.println("Deleting user with ID " + id);
    }
    public List<User> findAll() {
        System.out.println("Finding all users");
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John", "password123"));
        users.add(new User(2, "Jane", "password456"));
        return users;
    }

    public User findById(Integer id) {
        System.out.println("Finding user with ID " + id);
        return new User(id, "User" + id, "password" + id);
    }

    public User findByName(String name) {
        System.out.println("Finding user with name " + name);
        return new User(2, name, "password123");
    }
}
