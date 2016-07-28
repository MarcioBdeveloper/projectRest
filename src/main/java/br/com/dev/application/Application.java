package br.com.dev.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/***
 * 
 * Created by Márcio Barbosa - email: marciobarbosamobile@gmail.com
 * 29/02/2016
 * */
@SpringBootApplication
@EntityScan(basePackages = {"br.com.dev.entity"})
@EnableJpaRepositories(basePackages = {"br.com.dev.repository"})
@ComponentScan(basePackages = {"br.com.dev.controller"})
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

}