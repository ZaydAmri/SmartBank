package com.example.SmartBank.Controller;

import com.example.SmartBank.Enteties.Compte;
import com.example.SmartBank.Enteties.TypeCompte;
import com.example.SmartBank.Service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/compte")
@CrossOrigin(origins = "http://localhost:4200")
public class CompteController {
    @Autowired
    CompteService compteService;

    public Boolean checkExistingContrat(String contrat) {

        for (int i = 0; i < TypeCompte.values().length; i++) {

            if (TypeCompte.values()[i].toString().equals(contrat.toUpperCase())) {
                return true;
            }
        }

        return false;


    }

    @PostMapping("addCompte")
    public ResponseEntity addCompte(@Valid @RequestBody Compte compte,@RequestParam("codeGuichet") String codeGuichet,@RequestParam("codePays") String codePays ) {
        // ----------  TO DO
        if (!checkExistingContrat(compte.getTypeCompte().toString())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Champs contrat invalide");
        }
        return ResponseEntity.ok().body(compte);
    }
}
