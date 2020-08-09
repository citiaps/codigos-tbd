package cl.tbd.ejemplomongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Dog", path = "dogs")
public interface DogRepository extends MongoRepository<Dog, String> {
    List<Dog> findByName(@Param("name") String name);
    
}