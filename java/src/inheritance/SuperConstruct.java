package com.tardisgallifrey;

//base class
class Superclass {
   int age;

   Superclass(int age) {
      this.age = age; 		 
   }

   public void getAge() {
      System.out.println("The value of the variable named age in super class is: " +age);
   }
}

//This is nearly identical to creation of a
//component class in Reactjs
//the use of super() in that context
//reads all of the state of the parent into
//the child class

//Inherited class
public class SuperConstruct extends Superclass {
   Subclass(int age) {
       //calls on the age as constructed in the base 
       //class constructor above
      super(age);
   }

   public static void main(String args[]) {
      Subclass s = new Subclass(24);
      s.getAge();
   }
}