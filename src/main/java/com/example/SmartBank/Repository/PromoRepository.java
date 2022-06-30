package com.example.SmartBank.Repository;

import com.example.SmartBank.Enteties.Promo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromoRepository extends JpaRepository<Promo,Long> {
}
