package com.example.SmartBank.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SmartBank.Enteties.Credit;
import com.example.SmartBank.Repository.CreditRepository;
@Service
@Transactional
public class CreditServiceImp implements CreditService{
	@Autowired
    CreditRepository agent;
	@Override
	public List<Credit> getAll() {
		  return agent.findAll();
	}

	@Override
	public Optional<Credit> getByID(long id) {
		return agent.findById(id);
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
	public void saveOrUpdate(Credit credit) {
        agent.save(credit);
		
	}

	

}
