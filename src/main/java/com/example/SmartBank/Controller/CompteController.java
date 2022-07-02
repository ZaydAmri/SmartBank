package com.example.SmartBank.Controller;

import com.example.SmartBank.Enteties.Compte;
import com.example.SmartBank.Enteties.TypeCompte;
import com.example.SmartBank.Exception.RessourceNotFound;
import com.example.SmartBank.Service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

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
    @GetMapping("getKeyOfRib")
    public long calculCleRib(@RequestParam("codeB") String codeBanque,@RequestParam("codeG") String codeGuichet,@RequestParam("numC") String numCompte){
      // return String.valueOf(97 - ((89 * Integer.parseInt(codeBanque) + 15 * Integer.parseInt(codeGuichet) + 3 * Integer.parseInt(numCompte)) % 97));
        //return codeBanque+codeGuichet+numCompte;
        return 97 - ((89 * Integer.parseInt(codeBanque)+ 15 * Integer.parseInt(codeGuichet) + 3 * Long.parseLong(numCompte)) % 97);
    }

    @GetMapping("getRib")
    public String generateRib (@RequestParam("codeB") String codeBanque,@RequestParam("codeG") String codeGuichet,@RequestParam("numC") String numCompte){
        return codeBanque + codeGuichet + numCompte + calculCleRib(codeBanque,codeGuichet,numCompte);
    }

    @GetMapping("getIban")
    public String calculIban(@RequestParam("codeP") String codePays,@RequestParam("codeB") String codeBanque,@RequestParam("codeG") String codeGuichet,@RequestParam("numC") String numCompte){
        String newCodePays = "";
        //int i=codePays.length() - 1; i>=0;i--
        for(int i=0; i<codePays.length();i++){
            switch (codePays.charAt(i)) {
                case 'A':
                   newCodePays = newCodePays + "10";
                    break;
                case 'B':
                    newCodePays = newCodePays + "11";
                    break;
                case 'C':
                    newCodePays = newCodePays + "12";
                    break;
                case 'D':
                    newCodePays = newCodePays + "13";
                    break;
                case 'E':
                    newCodePays = newCodePays + "14";
                    break;
                case 'F':
                    newCodePays = newCodePays + "15";
                    break;
                case 'G':
                    newCodePays = newCodePays + "16";
                    break;
                case 'H':
                    newCodePays = newCodePays + "17";
                    break;
                case 'I':
                    newCodePays = newCodePays + "18";
                    break;
                case 'J':
                    newCodePays = newCodePays + "19";
                    break;
                case 'K':
                    newCodePays = newCodePays + "20";
                    break;
                case 'L':
                    newCodePays = newCodePays + "21";
                    break;
                case 'M':
                    newCodePays = newCodePays + "22";
                    break;
                case 'N':
                    newCodePays = newCodePays + "23";
                    break;
                case 'O':
                    newCodePays = newCodePays + "24";
                    break;
                case 'P':
                    newCodePays = newCodePays + "25";
                    break;
                case 'Q':
                    newCodePays = newCodePays + "26";
                    break;
                case 'R':
                    newCodePays = newCodePays + "27";
                    break;
                case 'S':
                    newCodePays = newCodePays + "28";
                    break;
                case 'T':
                    newCodePays = newCodePays + "29";
                    break;
                case 'U':
                    newCodePays = newCodePays + "30";
                    break;
                case 'V':
                    newCodePays = newCodePays + "31";
                    break;
                case 'W':
                    newCodePays = newCodePays + "32";
                    break;
                case 'X':
                    newCodePays = newCodePays + "33";
                    break;
                case 'Y':
                    newCodePays = newCodePays + "34";
                    break;
                case 'Z':
                    newCodePays = newCodePays + "35";
                    break;
            }
        }

        String ribValue = codeBanque + codeGuichet + numCompte + calculCleRib(codeBanque,codeGuichet,numCompte)+ newCodePays+"00";
        String first10Num = String.valueOf(Long.parseLong(ribValue.substring(0,10)) % 97);
        String sec10Num = String.valueOf(Long.parseLong(first10Num + ribValue.substring(10,18)) % 97);
        String thr10Num = String.valueOf(Long.parseLong(sec10Num + ribValue.substring(18,26)) % 97);
        String fou10Num = String.valueOf(Long.parseLong(thr10Num + ribValue.substring(26,29)) % 97);
        String cleIban = String.valueOf(98 - Long.parseLong(fou10Num));
        return codePays + cleIban + generateRib(codeBanque,codeGuichet,numCompte);

    }

    @PostMapping("addCompte")
    public ResponseEntity addCompte(@Valid @RequestBody Compte compte,@RequestParam("codeGuichet") String codeGuichet,@RequestParam("codePays") String codePays ) {
        // ----------  TO DO
        if (!checkExistingContrat(compte.getTypeCompte().toString())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Champs contrat invalide");
        }
        return ResponseEntity.ok().body(compte);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Compte> updateCompte(@PathVariable("id")Long id, @Valid @RequestBody Compte compte) throws RessourceNotFound{
        Compte oldCompte = compteService.getByID(id).orElseThrow(
                ()->new RessourceNotFound("compte not found")
        );
        compte.setId(oldCompte.getId());
        compteService.saveOrUpdate(compte);
        return ResponseEntity.ok().body(compte);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<Compte> getCompte(@PathVariable("id")Long id) throws RessourceNotFound{
        Compte compte = compteService.getByID(id).orElseThrow(
                ()->new RessourceNotFound("Client not found")
        );
        return ResponseEntity.ok().body(compte);
    }

    @GetMapping("getall")
    public ResponseEntity<?> getAll() throws RessourceNotFound{

        return ResponseEntity.ok().body( compteService.getAll());
    }

    @DeleteMapping("delete/{id}")
    public Map<String,Boolean> deleteCompte(@PathVariable("id")Long id) throws RessourceNotFound{
        Compte compte = compteService.getByID(id).orElseThrow(
                ()->new RessourceNotFound("Compte not found")
        );
        compteService.deleteByID(compte.getId());
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
