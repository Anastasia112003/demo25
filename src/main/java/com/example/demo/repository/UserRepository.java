package com.example.demo.repository;

import com.example.demo.exception.InvalidCredentials;
import com.example.demo.model.Authorities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list = new ArrayList<>();
        Map<String, String> users = new HashMap<>();
        users.put("Sindy", "505");
        users.put("Maxim", "693");

        if (users.containsKey(user) && users.get(user).equals(password)) {
            if ("Maxim".equals(user)) {
                list.add(Authorities.READ);
            }
        } else {
            throw new InvalidCredentials("Username or password invalid");
        }

        return list;
    }
    }

