package com.example.SmartBank.Service;

import com.example.SmartBank.Enteties.User;
import com.example.SmartBank.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository agent;

    @Override
    public void saveOrUpadte(User user) {
        agent.save(user) ;
    }

    @Override
    public Optional<User> getUserById(long id) {
        return agent.findById(id);
    }

    @Override
    public void delete(long id) {
        agent.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return agent.findAll();
    }
}
