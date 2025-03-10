package com.companydb01.clientapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {


    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Permitir todas las rutas
                        .allowedOrigins("*") // Permitir cualquier origen
                        .allowedMethods("*") // Permitir cualquier método HTTP (GET, POST, PUT, DELETE, etc.)
                        .allowedHeaders("*") // Permitir cualquier encabezado
                        .allowCredentials(false); // No permitir el envío de cookies o credenciales
            }
        };
    }
}
