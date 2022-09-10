package com.example.miniproject1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Student {
    private UUID id;
    private String firstName;
    private String lastName;
    private double gpa;
    private LocalDate dob;

    public Student(String firstName, String lastName, double gpa, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Student() {

    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Id
    public UUID getId() {
        return id;
    }
}
