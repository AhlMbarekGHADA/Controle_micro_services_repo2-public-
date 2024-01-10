package com.example.coursservice.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class CoursEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;

    // Getters

    public Long getId(){
        return this.id;
    }

    public String getNom(){
        return this.nom;
    }

    public String getDescription(){
        return this.description;
    }

    //setters
    public void setId(Long id){
        this.id=id;
    }

    public void setNom(String nom){
        this.nom=nom;
    }

    public void setPrenom(String description){
        this.description=description;
    }
}

