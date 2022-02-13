package com.tardisgallifrey;

public class Main{
    public static void main(String[] args){
        System
           .out
           .println("Hello World.");

        String name = "Dave";
        System.out.println(name);

        int mynum = 61;
        System.out.println(mynum);

        //Basic variable types
        // "final" is the equivalent to "const"
        final int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        //the + sign is concatenation of strings
        String firstName = "Dave ";
        String lastName = "Vest";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        //Casting from smaller variables to larger is automatic
        //You can assign an int to a double and it works.
        int aInt = 9;
        double aDouble = aInt; // Automatic casting: int to double

        //Casting from larger space variables to smaller is manual
        //You need the cast (int) to take the double to an int
        aDouble = 9.78d;
        aInt = (int) aDouble; // Manual casting: double to int

        //Strings are objects in Java. 
        //They have some built-in methods like length()
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        //And toUpper and to LowerCase
        txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        //And, indexOf
        txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        //You can also concatenate with concat method
        firstName = "John ";
        lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        //There are a ton of String methods.  Look them up.
    }

}