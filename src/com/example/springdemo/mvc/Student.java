package com.example.springdemo.mvc;


import java.util.LinkedHashMap;

public class Student {

    private String firstName;

    private String lastName;
    private String country;
    private String favouriteLanguage;
    private String[] OS;

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    private final LinkedHashMap<String,String> countryOptions= new LinkedHashMap<>();

    public Student(){
        // populate country options: used ISO country code
        countryOptions.put("PL", "Poland");
        countryOptions.put("GB", "Great Britain");
        countryOptions.put("DE", "Germany");
        countryOptions.put("UA", "Ukraine");
        countryOptions.put("RU", "Russia");

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }


    public String[] getOS() {
        return OS;
    }

    public void setOS(String[] OS) {
        this.OS = OS;
    }
}
