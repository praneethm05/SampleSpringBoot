package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = {
        "org.example"})


public class App 
{
    public static void main( String[] args )
    {
        try {
            SpringApplication.run(App.class, args);
        } catch (Exception e) {
            System.out.println("Error in running application");
        }

    }
}

