/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proje;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author canca
 */
@SpringBootApplication
public class Proje {

    public static void main(String[] args) {
        SpringApplication.run(Proje.class, args);
    }
    
    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
