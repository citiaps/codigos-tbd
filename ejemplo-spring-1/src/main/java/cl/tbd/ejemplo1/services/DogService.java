package cl.tbd.ejemplo1.services;

import cl.tbd.ejemplo1.models.Dog;
import cl.tbd.ejemplo1.repositories.DogRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogService {

    private final DogRepository dogRepository;
    DogService(DogRepository dogRepository){
        this.dogRepository = dogRepository;
    }

    @GetMapping("/dogs")
    public List<Dog> getAllDogs() {
        return dogRepository.getAllDogs();
    }

    @GetMapping("/dogs/count")
    public String countDogs(){
        int total = dogRepository.countDogs();
        return String.format("You have %s dogs!!", total);
    }
}
