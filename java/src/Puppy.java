package com.tardisgallifrey;

//This is an example of constructor use

public class Puppy {
   //This is the constructor, 
   //a method with the same name as the class name
   public Puppy(String name) {
      // This constructor has one parameter, name.
      System.out.println("Passed Name is :" + name );
   }

   public static void main(String []args) {
      // Following statement would create an object myPuppy
      //
      //This type of constructor requires?? the paramter
      //to be given upon instantiation
      Puppy myPuppy = new Puppy( "tommy" );
   }
}