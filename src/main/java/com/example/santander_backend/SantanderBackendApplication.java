package com.example.santander_backend;

import com.example.santander_backend.model.Person;
import com.example.santander_backend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SantanderBackendApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SantanderBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Poblar la base de datos con datos iniciales
		personRepository.save(new Person("001", "Juan Pérez", "12345678A", "Normal", "F", "DNI"));
		personRepository.save(new Person("002", "Empresa S.A.", "B12345678", "Empresa", "J", "CIF"));
		personRepository.save(new Person("003", "Ana Gómez", "87654321Z", "VIP", "F", "NIE"));
		personRepository.save(new Person("004", "Carlos López", "23456789B", "Normal", "F", "DNI"));
		personRepository.save(new Person("005", "Tech Solutions", "C23456789", "Empresa", "J", "CIF"));
		personRepository.save(new Person("006", "María Fernández", "34567890C", "VIP", "F", "DNI"));
	}
}