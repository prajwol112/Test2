package com.Test2.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
@Table(name = "data")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(nullable = false, length = 50, unique = true)
    private int Age;
    @Column(nullable = false, length = 64)
    private String FirstName;

    @Column(nullable = false, length = 64)
    private String LastName;

    public Data() {
    }


    public Data(int Age, String FirstName) {
        this.Age = Age;
        this.FirstName = FirstName;
    }
    //setters and getters for id
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    //setters and getters for Age
    public void setAge(int Age) {
        this.Age = Age;
    }
    public int getAge() {
        return Age;
    }

    //setters and getters for Name
    public void setFirstName(String Name) {
        this.FirstName = Name;
    }
    public String getFirstName() {
        return FirstName;
    }




}
