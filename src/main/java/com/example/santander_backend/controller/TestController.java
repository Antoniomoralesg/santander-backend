package com.example.santander_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // Endpoint de prueba para verificar la conexión
    @GetMapping("/api/test-connection")
    public ResponseEntity<String> testConnection() {
        return ResponseEntity.ok("Conexión exitosa");
    }
}
