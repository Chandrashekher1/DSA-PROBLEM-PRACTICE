package com.CP03.staticExample;

public class Main {
    public static void main(String[] args) {
        Human CP = new Human(20, "Chandu Kumar", 100000,false);
        Human CSP = new Human(20, "Chandrashekher", 100000,false);

//        System.out.println(CP.Population);   // Don't use this it will work but don't
//        System.out.println(CSP.Population);

         // use class at the place of object

//        System.out.println(Human.Population);
//        System.out.println(Human.Population);

        Main funn = new Main();
        funn.fun2();

    }
    // this is not dependent on objects
    static void fun() {
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
//        fun();
        System.out.println("Hello world");
    }

}
