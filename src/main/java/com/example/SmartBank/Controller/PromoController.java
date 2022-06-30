package com.example.SmartBank.Controller;

import com.example.SmartBank.Enteties.Promo;
import com.example.SmartBank.Exeption.ResourceNotFoundException;
import com.example.SmartBank.Service.PromoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PromoController {
    @Autowired
    PromoService agent;

    //getAll
    @GetMapping("/promos")
    public List<Promo> getAllPromos(){
        return agent.getAllPromos();
    }

    //Create
    @RequestMapping("/promos")
    public String createPromo(@Valid @RequestBody Promo promo){
        agent.saveOrUpadte(promo);
        return "Promo ajouté avec succes";
    }

    //getById
    @GetMapping("/promos/{id}")
    public Promo getPromoById(@PathVariable(value="id") long promoId) throws ResourceNotFoundException {
        Promo promo = agent.getPromoById(promoId).orElseThrow(() -> new ResourceNotFoundException("Promo not found" + promoId));
        return promo;
    }

    //Update

    @PutMapping("/promos/{id}")
    public String updatePromo(@PathVariable(value="id") long promoId, Promo promoDetails) throws ResourceNotFoundException{
        Promo promo = agent.getPromoById(promoId).orElseThrow(() -> new ResourceNotFoundException("Promo not found" + promoId));
        promo.setTitre(promoDetails.getTitre());
        promo.setDescription(promoDetails.getDescription());
        promo.setDuree(promoDetails.getDuree());
        agent.saveOrUpadte(promo);
        return "Promo updated";
    }
    //Delete
    @DeleteMapping("/promos/{id}")
    public String deletePromo(@PathVariable(value="id") long promoId, Promo promoDetails) throws ResourceNotFoundException{
        Promo promo = agent.getPromoById(promoId).orElseThrow(() -> new ResourceNotFoundException("Promo not found" + promoId));
        agent.delete(promoId);
        return "Promo deleted";
    }
}
