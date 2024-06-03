package com.app.user.services;

import com.app.user.model.User;
import com.app.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserRepository repository;

    public List<User> getAllUser() {
        return repository.findAll();
    }
}
