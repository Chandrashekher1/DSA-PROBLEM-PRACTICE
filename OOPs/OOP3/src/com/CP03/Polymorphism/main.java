package com.CP03.Polymorphism;

public class main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
//
//        Shapes shape = new Shapes();
//        Shapes circle = new Circle();
//        Shapes square = new Square();

        shape.area();
        circle.area();
        square.area();
     }
}
