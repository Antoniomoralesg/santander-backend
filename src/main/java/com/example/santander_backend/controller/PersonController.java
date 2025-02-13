package com.example.santander_backend.controller;

import com.example.santander_backend.model.Person;
import com.example.santander_backend.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        Person savedPerson = personService.savePerson(person);
        return new ResponseEntity<>(savedPerson, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Person>> getPeople() {
        List<Person> people = personService.getAllPeople();
        return new ResponseEntity<>(people, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Person>> searchPeople(@RequestParam String personType, @RequestParam String searchCriteria, @RequestParam String searchQuery, @RequestParam(required = false) String documentType) {
        List<Person> people = personService.getAllPeople().stream()
                .filter(person -> person.getPersonType().equals(personType))
                .filter(person -> {
                    if (searchCriteria.equals("DOCUMENTO")) {
                        return person.getDocument().contains(searchQuery) && (documentType == null || person.getDocumentType().equals(documentType));
                    } else if (searchCriteria.equals("NOMBRE")) {
                        return person.getName().toLowerCase().contains(searchQuery.toLowerCase());
                    }
                    return false;
                })
                .collect(Collectors.toList());
        return new ResponseEntity<>(people, HttpStatus.OK);
    }
}