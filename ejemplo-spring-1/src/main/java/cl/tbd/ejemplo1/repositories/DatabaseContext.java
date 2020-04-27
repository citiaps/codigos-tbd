package cl.tbd.ejemplo1.repositories;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sql2o.Sql2o;

@Configuration
public class DatabaseContext {

    @Bean
    public Sql2o sql2o(){
        //Modificar string de conexión para obtener valores desde .properties
        return new Sql2o("jdbc:postgresql://127.0.0.1:5432/postgres","tbduser","tbdpass");
    }
}
