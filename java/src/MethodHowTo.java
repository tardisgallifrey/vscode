package com.tardisgallifrey;

public class MethodHowTo{

    //Method definition
    static void myMethod() {
        System.out.println("I just got excited!");
    }

    //a method with a parameter
    static void aMethod(String fname) {
        System.out.println(fname + " likes hamburgers.");
    }

    //a method that returns a value
    static int bMethod(int x) {
        return 5 + x;
    }

    //a method that returns with mor than one parameter
    static int cMethod(int x, int y) {
        return x + y;
    }

    //a method with a decision
        // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
        System.out.println("Access denied - You are not old enough!");

        // If age is greater than, or equal to, 18, print "access granted"
        } else {
        System.out.println("Access granted - You are old enough!");
        }
    }

    //Main method
    public static void main(String[] args) {
        //Method call
        myMethod();

        aMethod("Dave");

        System.out.println(bMethod(3));

        System.out.println(cMethod(2, 2));

        checkAge(22);
    }

}