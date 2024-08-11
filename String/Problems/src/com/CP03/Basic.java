package com.CP03;

//import static jdk.internal.org.jline.utils.Colors.s;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        String str1 = "chandu";
        String str2 = "chandu";

        String a = new String("chandu");
        String b = new String("chanud");

//        System.out.println(a[0]); // error b/c not a array

        System.out.println(a.charAt(0));

        if (str1 == str2) {
            System.out.println("true");
        }

        if (a == b) { // error b/c it does not point to the same object
            System.out.println("true");
        }

        if (str1.equals(str2)) {
            System.out.println("true");
        }
        System.out.println((char) (97));

        System.out.println("a" + 'a');  // output : aa
        // b/c if one of the object is string then output will also string

        // toCharArray

        System.out.println(Arrays.toString(str1.toCharArray()));

        // lenght()
        System.out.println(str1.length());

        // toLowerCase()

        System.out.println(str1.toLowerCase());

        // indexOf()

        System.out.println(str1.indexOf('a'));

        // .strip()  : for removing space from string

        System.out.println(str1.strip());
    }
}
