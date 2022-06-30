package com.example.SmartBank.Service;

import com.example.SmartBank.Enteties.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public void saveOrUpadte(User user);
    public Optional<User> getUserById(long id);
    public void delete(long id);
    public List<User> getAllUsers();
}
