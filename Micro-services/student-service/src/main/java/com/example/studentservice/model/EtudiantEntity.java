package com.example.studentservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class EtudiantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private int age;
    private String CNE;
    private String CNI;

    @ManyToOne
    @JoinColumn(name = "cours_id")
    private CoursEntity cours;

    //getters
    public Long getId(){
        return this.id;
    }

    public string getNom(){
        return this.nom;
    }

    public string getPrenom(){
        return this.prenom;
    }

    public int getAge(){
        return this.age;
    }

    public string getCNE(){
        return this.CNE;
    }

    public string getCNI(){
        return this.CNI;
    }

    //setters
    public void setId(Long id){
        this.id=id;
    }

    public void setNom(string nom){
        this.nom=nom;
    }

    public void setPrenom(string prenom){
        this.prenom=prenom;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setCNE(string CNE){
        this.CNE=CNE;
    }

    public void setCNI(string CNI){
        this.CNI=CNI;
    }
}
