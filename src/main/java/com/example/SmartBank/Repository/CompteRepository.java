package com.example.SmartBank.Repository;

import com.example.SmartBank.Enteties.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CompteRepository extends JpaRepository<Compte,Long> {

    Optional<Compte> findByIntitule(Long id);
    Optional<Compte> findByRib(String rib);
    @Query(value = "update Compte set visibility=true where id = :id")
    void makeEnabled(@Param("id") Long id);

    @Query(value = "update Compte set visibility=false where id = :id")
    void makeDisabled(@Param("id")Long id);

}
