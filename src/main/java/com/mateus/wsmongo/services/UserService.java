package com.mateus.wsmongo.services;

import com.mateus.wsmongo.domain.User;
import com.mateus.wsmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    public List<User> findAll() {
        return repository.findAll();
    }
}
