package com.example.SmartBank.Service;

import java.util.List;
import java.util.Optional;

import com.example.SmartBank.Enteties.Credit;

public interface CreditService {
	public List<Credit> getAll();
    public Optional<Credit> getByID(long id);
    public void deleteByID(long id);
    public void deleteAll();
    public void saveOrUpdate(Credit credit);
}
