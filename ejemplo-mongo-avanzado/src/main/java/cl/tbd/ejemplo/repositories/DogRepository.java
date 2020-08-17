package cl.tbd.ejemplo.repositories;

import java.util.List;

import org.bson.Document;

import cl.tbd.ejemplo.models.Dog;

public interface DogRepository {
    public int countDogs();
    public List<Dog> getDogs();
    public Dog createDog(Dog dog);
}