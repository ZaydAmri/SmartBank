package com.example.SmartBank.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SmartBank.Enteties.Compte;
import com.example.SmartBank.Enteties.Credit;
import com.example.SmartBank.Exception.RessourceNotFound;
import com.example.SmartBank.Service.CreditService;

@RestController
@RequestMapping("/credit")
@CrossOrigin(origins = "http://localhost:4200")
public class CreditController {
	@Autowired
    CreditService creditService;
	 @PostMapping("/")
	 public String addCompte(@Valid @RequestBody Credit credit) {
		 
		 creditService.saveOrUpdate(credit);
		 	
	        return "Credit ajouter";
	    }
	/* @PostMapping("/")
	 public ResponseEntity<Credit> updateCompte(@Valid @RequestBody Credit credit) {
		 
		 creditService.saveOrUpdate(credit);
		 	
	        return ResponseEntity.ok().body(credit);
	    }*/
	 
	 @PostMapping("/{id}")
	 public ResponseEntity<Optional<Credit>> GetCreditById(@PathVariable int id) {
		 
       Optional<Credit> credit=creditService.getByID(id);		 
	        return ResponseEntity.ok().body(credit);
	    }

	 @GetMapping("/")
	    public ResponseEntity<List<Credit>> getAll() throws RessourceNotFound{

	        return ResponseEntity.ok().body( creditService.getAll());
	    }

	    @DeleteMapping("/{id}")
	    public Map<String,Boolean> deleteCompte(@PathVariable("id")Long id) throws RessourceNotFound{
	        Credit credit = creditService.getByID(id).orElseThrow(
	                ()->new RessourceNotFound("Credit not found")
	        );
	        creditService.deleteByID(credit.getId());
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	    }
}
