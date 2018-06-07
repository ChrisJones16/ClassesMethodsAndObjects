package com.company;

public class Bird extends Pet {

    String name;
    String featherColor;
    int wings;
    int legs;
    double weight;
    char gender;

    public Bird(String ownerName, String petName, int age, char gender, String homeAddress) {
        super(ownerName, petName, age, gender, homeAddress);
    }

    public Bird(String name, int wings, double weight, char gender) {
        this.name = name;
        this.wings = wings;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
