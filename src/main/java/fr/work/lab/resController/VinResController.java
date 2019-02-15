package fr.work.lab.resController;

import fr.work.lab.modele.Vin;
import fr.work.lab.repository.vinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@RequestMapping(value = "/vin")
public class VinResController {

    @Autowired
    private vinRepository vinRepository;

    @RequestMapping(value = "{/id}", method = RequestMethod.GET)
    public ResponseEntity<Vin> findById(@PathVariable(name = "id") Integer id) {
        Optional<Vin> opt = vinRepository.findById(id);
        if (opt.isPresent()) {
            return new ResponseEntity<Vin>(opt.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

/*
@RequestMapping(value = "{/nom}", method = RequestMethod.GET)
public ResponseEntity<Vin> findByName (@PathVariable(name="nom") String nom){
Optional<Vin> opt = vinRepository.findByName(nom);
}
*/

}
