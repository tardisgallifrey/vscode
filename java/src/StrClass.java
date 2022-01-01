package com.tardisgallifrey;

//The methods in String class are so numerous,
//I'm only going to show some common ones

public class StringDemo {

   public static void main(String args[]) {
      String palindrome = "Dot saw I was Tod";

      //string length
      int len = palindrome.length();
      System.out.println( "String Length is : " + len );

      //Concat more commone with +
      System.out.println("This is a string. "+"And, so is this.");

      //but, also concat()
      System.out.println("This is another string.".concat(" plus this too."));

        //Printf is still here
      System.out.printf("The value of the float variable is " +
                  "%f, while the value of the integer " +
                  "variable is %d, and the string " +
                  "is %s", 10.5, 2, "Yet, another string.");

        //Also, this
        String fs;
        s = String.format("The value of the float variable is " +
                   "%f, while the value of the integer " +
                   "variable is %d, and the string " +
                   "is %s", 98.7, 20, "And, still another");
        System.out.println(fs);
   }
}