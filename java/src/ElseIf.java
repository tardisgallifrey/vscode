package com.tardisgallifrey;

public class ElseIf {

   public static void main(String args[]) {
      int x = 30;

    //NOTE: the space in else if
      if( x == 10 ) {
         System.out.print("Value of X is 10");
      }else if( x == 20 ) {
         System.out.print("Value of X is 20");
      }else if( x == 30 ) {
         System.out.print("Value of X is 30");
      }else {
         System.out.print("This is else statement");
      }

      //Conditionals are OK too
      int time = 20;
      String result = (time < 18) ? "Good day." : "Good evening.";
      System.out.println(result);

      
   }
}