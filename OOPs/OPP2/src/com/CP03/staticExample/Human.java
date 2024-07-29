package com.CP03.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long Population;

    static void message(){
        System.out.println("Hello World");
//        System.out.println(this.age); // can't use this over because this is object whereas static depends on class
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.Population +=1  ;
    }
}
