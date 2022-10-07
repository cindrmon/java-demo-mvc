package com.javademo.mvc.model;

import java.util.UUID;

public class Account {
    private final UUID ID;
    private String firstName;
    private String lastName;
    private String gender;
    private String bio;

    public Account() {
        this.ID = UUID.randomUUID();
        this.firstName = "";
        this.lastName = "";
        this.gender = "";
        this.bio = "";
    }

    public Account(String firstName, String lastName, String gender, String bio) {
        this.ID = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.bio = bio;
    }

    public UUID getID() {
        return ID;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
