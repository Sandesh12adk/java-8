package org.example.configure;

import org.example.model.Customer;
import org.example.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfigure {
@Bean
    public Product product(){
        var veh= new Product();
        return veh;
    }
    @Bean
    public Customer customer(){
        var veh= new Customer();
        return veh;
    }
    @Bean
    String hello(){
        return "Hello! Spring";
    }
    @Bean
    String hi(){
        return "Hi";
    }
}
