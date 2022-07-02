package com.example.SmartBank.Service;

import com.example.SmartBank.Enteties.Compte;

import java.util.List;
import java.util.Optional;

public interface CompteService {
    public List<Compte> getAll();
    public Optional<Compte> getByID(long id);
    public Optional<Compte> getByIntituleID(long id);
    public Optional<Compte> getByRib(String rib);
    public void deleteByID(long id);
    public void deleteAll();
    public void saveOrUpdate(Compte compte);
    public void enable(Long id);
    public void disable(Long id);
}
