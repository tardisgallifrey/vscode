package com.tardisgallifrey;

class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   public void move() {

       //Forces this class to run parent class's method
      super.move();   // invokes the super class method
      System.out.println("Dogs can walk and run");
   }
}

public class TestDogSuper {

   public static void main(String args[]) {

       //You just thought both had to be the same
      Animal b = new Dog();   // Animal reference but Dog object
      b.move();   // runs the method in Dog class
   }
}