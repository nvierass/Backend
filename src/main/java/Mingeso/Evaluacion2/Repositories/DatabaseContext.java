package Mingeso.Evaluacion2.Repositories;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sql2o.Sql2o;

@Configuration
public class DatabaseContext {
    @Value("${spring.datasource.url}")
    private String url;// = "jdbc:postgresql://127.0.0.1:5432/BD_Mingeso";
    @Value("${spring.datasource.username}")
    private String username;// = "postgres";
    @Value("${spring.datasource.password}")
    private String password;// = "postgres";
    @Bean
    public Sql2o sql2o(){
        return new Sql2o(url, username, password);
    }
}