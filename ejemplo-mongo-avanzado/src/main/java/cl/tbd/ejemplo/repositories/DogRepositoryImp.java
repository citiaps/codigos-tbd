package cl.tbd.ejemplo.repositories;

import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cl.tbd.ejemplo.models.Dog;

@Repository
public class DogRepositoryImp implements DogRepository {

    @Autowired
    MongoDatabase database;

    @Override
    public int countDogs() {
        MongoCollection<Document> collection = database.getCollection("dog");
        long count = collection.countDocuments();
        return (int) count;
    }

    @Override
    public List<Dog> getDogs() {
        MongoCollection<Dog> collection = database.getCollection("dog", Dog.class);
        List <Dog> dogs = collection.find().into(new ArrayList<>());
        
        return dogs;
    }

    @Override
    public Dog createDog(Dog dog) {
        MongoCollection<Dog> collection = database.getCollection("dog", Dog.class);
        collection.insertOne(dog);
        return dog;
    }
    
}