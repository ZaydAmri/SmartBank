package com.example.SmartBank.Service;

import com.example.SmartBank.Enteties.Promo;
import com.example.SmartBank.Repository.PromoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PromoServiceImpl implements PromoService{

    @Autowired
    PromoRepository agent;

    @Override
    public void saveOrUpadte(Promo promo) {
        agent.save(promo);
    }

    @Override
    public Optional<Promo> getPromoById(long id) {
        return agent.findById(id);
    }

    @Override
    public void delete(long id) {
        agent.deleteById(id);
    }

    @Override
    public List<Promo> getAllPromos() {
        return agent.findAll();
    }
}
