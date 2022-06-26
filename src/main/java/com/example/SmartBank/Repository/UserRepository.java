package com.example.SmartBank.Repository;

import com.example.SmartBank.Enteties.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
