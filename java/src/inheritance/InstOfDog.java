package com.tardisgallifrey;

//empty interface
interface Animal{}

//Mammal inherits/implements Animal,
//but is by definition, an interface
class Mammal implements Animal{}


//InstOfDog is a class.  It can be instantiated.
//Mammal and Animal cannot
public class InstOfDog extends Mammal {

   public static void main(String args[]) {
      Mammal m = new Mammal();
      InstOfDog d = new InstOfDog();

        //Instanceof used to check upwards 
        //relationship
      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
   }
}
