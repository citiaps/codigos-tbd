package cl.tbd.ejemplo1.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {

    @GetMapping("/hello")
    public String HelloWorld(){
        return "Hola mundo";
    }

    @PostMapping("/hello")
        public String answer(@RequestBody String message){
            return "hola "+message + "!";
    }

}
