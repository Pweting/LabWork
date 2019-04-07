package fr.work.lab.resController;


import fr.work.lab.modele.Liqueur;
import fr.work.lab.repository.LiqueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@RequestMapping(value = "/liqueur")
public class LiqueurResController {

    @Autowired
    private LiqueurRepository liqueurRepository;

    @RequestMapping(value = "{/id}", method = RequestMethod.GET)
    public ResponseEntity<Liqueur> findById(@PathVariable(name = "id") Integer id) {
        Optional<Liqueur> opt = liqueurRepository.findById(id);
        if (opt.isPresent()) {
            return new ResponseEntity<Liqueur>(opt.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<Liqueur>(HttpStatus.NOT_FOUND);
        }
    }
}
