package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {
    private List<User> users = new ArrayList<>();

    public User createUser(User user) {
        users.add(user);
        return user;
    }

    public Optional<User> readUser(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst();
    }

    public User updateUser(int id, User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getId() == id) {
                users.set(i, updatedUser);
                return updatedUser;
            }
        }
        return null;
    }

    public boolean deleteUser(int id) {
        return users.removeIf(user -> user.getId() == id);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }
}

class User {
    private int id;
    private String name;

    // Constructor, Getters, and Setters
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
