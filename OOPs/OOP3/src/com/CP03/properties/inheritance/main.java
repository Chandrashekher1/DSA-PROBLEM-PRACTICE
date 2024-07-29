package com.CP03.properties.inheritance;

public class main {
    public static void main(String[] args) {
//        Box box = new Box();
//        Box box1 = new Box(4.6,4.4,2.5);
//        Box box2 = new Box(box);  // old constructor
//
//        BoxWeight box3 = new BoxWeight();

//        System.out.println(box.l +" " + box.h +" "+ box.w);
//        System.out.println(box1.l +" " + box1.h +" "+ box1.w);

//        System.out.println(box3.l + " "+ box3.weight);

        Box box5 = new BoxWeight(1,3,4,6);
//        System.out.println(box5.weight); //Error
        System.out.println(box5);

        // there are many variables in both parent and child classess
        // you are given access to variables that are in the ref type i.e BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor
        // this is why error

//        BoxWeight box6 = new Box(1,2,3,4); // error
//        System.out.println(box6);

        BoxPrice box = new BoxPrice();


    }
}
