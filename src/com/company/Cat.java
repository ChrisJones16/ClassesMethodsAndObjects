package com.company;

public class Cat {
    // all classes must start with a capital letter

    String name;
    boolean whiskers;
    boolean fur;
    int legs;
    double weight;
    String furColor;

    //public means it can be accessed anywhere inside the package
    //return means to send back
    //void means this method does not return any code
    //this. means that the variable in
    //constructors are how you create your objects


    public Cat(String name, int legs, double weight) {
        this.name = name;
        this.legs = legs;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWhiskers() {
        return whiskers;
    }

    public void setWhiskers(boolean whiskers) {
        this.whiskers = whiskers;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
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

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
