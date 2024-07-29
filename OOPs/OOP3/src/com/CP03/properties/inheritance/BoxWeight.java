package com.CP03.properties.inheritance;

// Inheritance Box object with help of extends keyword

public class BoxWeight extends Box{
    double weight;


    public BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // what is this? call the parent class constructor
        // used to initialise values present in parent class
        this.weight = weight;
    }
}
