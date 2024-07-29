package com.CP03.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    // cube
    // second constructor

    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }
    // 3 Constructor
    Box(double l, double h, double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    // 4 Constructor
    Box(Box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
