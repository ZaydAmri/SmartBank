package com.example.SmartBank.Controller;

import com.example.SmartBank.Service.UserService;
import com.example.SmartBank.Enteties.User;
import com.example.SmartBank.Exeption.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService agent;

    @GetMapping("/users")
    public List<User> listUsers(){
        return agent.getAllUsers();
    }

    @PostMapping("/users")
    public String addUser(@RequestBody User user){
        agent.saveOrUpadte(user);
        return "User ajouté avec succes";
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable(value="id") long userId) throws ResourceNotFoundException {

        User user =  agent.getUserById(userId).orElseThrow(() -> new ResourceNotFoundException("User not found" + userId));

        return user;
    }

    @DeleteMapping("/users/{id}")
    public String deleteUsers(@PathVariable(value="id") long userId) throws ResourceNotFoundException{

        User user = agent.getUserById(userId).orElseThrow(
                ()-> new ResourceNotFoundException("user not found for id : "+userId)
        );
        agent.delete(userId);
        return "Deleted : True";
    }

    @PutMapping("/users/{id}")
    public String updateUser(@PathVariable(value="id") long userId,@RequestBody User newUser) throws ResourceNotFoundException{

        User user = agent.getUserById(userId).orElseThrow(
                ()-> new ResourceNotFoundException("Doctor not found for id : " +userId)
        );

        user.setNom(newUser.getNom());
        user.setPrenom(newUser.getPrenom());
        user.setAdress(newUser.getAdress());
        user.setCin(newUser.getCin());
        user.setEmail(newUser.getEmail());
        user.setIpAdress(newUser.getIpAdress());
        user.setNomUtilisateur(newUser.getNomUtilisateur());
        user.setMotDePasse(newUser.getMotDePasse());
        user.setTelephone(newUser.getTelephone());

        agent.saveOrUpadte(user);
        return "user mis à jour";
    }

}
