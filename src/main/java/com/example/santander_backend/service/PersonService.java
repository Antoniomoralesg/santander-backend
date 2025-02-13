package com.example.santander_backend.service;


import com.example.santander_backend.model.Person;
import com.example.santander_backend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    public Person getPersonByCode(String code) {
        return personRepository.findById(code).orElse(null);
    }

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }
}