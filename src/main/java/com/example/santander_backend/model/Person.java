// filepath: src/main/java/com/example/santander_backend/model/Person.java
package com.example.santander_backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    private String code;
    private String name;
    private String document;
    private String clientType;
    private String personType;
    private String documentType;

    public Person() {}

    public Person(String code, String name, String document, String clientType, String personType, String documentType) {
        this.code = code;
        this.name = name;
        this.document = document;
        this.clientType = clientType;
        this.personType = personType;
        this.documentType = documentType;
    }

    // Getters and setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", document='" + document + '\'' +
                ", clientType='" + clientType + '\'' +
                ", personType='" + personType + '\'' +
                ", documentType='" + documentType + '\'' +
                '}';
    }
}