package com.practice.springboot.thymeleafdemo.model;

public class Student {

    private String firstName;

    private String lastName;

    private String country;

    private String programmingLanguage;

    private String favoriteSystems;

    public Student (){}

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getFavoriteSystems() {
        return favoriteSystems;
    }

    public void setFavoriteSystems(String favoriteSystems) {
        this.favoriteSystems = favoriteSystems;
    }
}
