package com.example.SmartBank.Service;

import com.example.SmartBank.Enteties.Compte;
import com.example.SmartBank.Repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CompteServiceImp implements CompteService{
    @Autowired
    CompteRepository agent;
    @Override
    public List<Compte> getAll() {
        return agent.findAll();
    }

    @Override
    public Optional<Compte> getByID(long id) {
        return agent.findById(id);
    }

    @Override
    public Optional<Compte> getByIntituleID(long id) {
        return agent.findByIntitule(id);
    }

    @Override
    public Optional<Compte> getByRib(String rib) {
        return agent.findByRib(rib);
    }

    @Override
    public void deleteByID(long id) {
        agent.deleteById(id);
    }

    @Override
    public void deleteAll() {
        agent.deleteAll();
    }

    @Override
    public void saveOrUpdate(Compte compte) {
        agent.save(compte);
    }

    @Override
    public void enable(Long id) {
        agent.makeEnabled(id);
    }

    @Override
    public void disable(Long id) {
        agent.makeDisabled(id);
    }
}
