package com.example.SmartBank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SmartBank.Enteties.Credit;

public interface CreditRepository extends JpaRepository<Credit,Long> {

}
