package com.tardisgallifrey;

public class NumObject { 

   public static void main(String args[]) {

       int y = 1;       //this is an integer primitive
      Integer x = 5;    //This is an integer object
      
      //Integer objects have methods
      // Returns byte primitive data type
      System.out.println( x.byteValue() );

      // Returns double primitive data type
      System.out.println(x.doubleValue());

      // Returns long primitive data type
      System.out.println( x.longValue() );      
   }
}