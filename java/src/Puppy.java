package com.tardisgallifrey;

//This is an example of constructor use

public class Puppy {

   //A class variable
   int puppyAge;

   //A class variable
   string puppyName;

   //This is the constructor because it has the same
   // name as the class.  It receives a string that
   // it sets for the class variable
   public Puppy(String name) {
      // This constructor has one parameter, name.

      //Set puppyName to passed in name
      puppyName = name;
      System.out.println("Name chosen is :" + puppyName );
   }

   //A class method
   public void setAge( int age ) {
      puppyAge = age;
   }

   //Another class method
   public int getAge( ) {
      System.out.println("Puppy's age is :" + puppyAge );
      return puppyAge;
   }

   public static void main(String []args) {
      /* Object creation */
      //Send name to new puppy object
      Puppy myPuppy = new Puppy( "tommy" );

      /* Call class method to set puppy's age */
      myPuppy.setAge( 2 );

      /* Call another class method to get puppy's age */
      myPuppy.getAge( );

      /* You can access instance variable as follows as well */
      System.out.println("Variable Value :" + myPuppy.puppyAge );
   }
}