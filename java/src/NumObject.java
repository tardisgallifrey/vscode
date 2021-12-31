package com.tardisgallifrey;

public class NumObject { 

   public static void main(String args[]) {

       int m = 1;       //this is an integer primitive
      Integer x = 5;    //This is an integer object
      Integer y = 10;
      Integer z =5;
      Short a = 5;
      
      //Integer objects have methods
      // Returns byte primitive data type
      System.out.println( x.byteValue() );

      // Returns double primitive data type
      System.out.println(x.doubleValue());

      // Returns long primitive data type
      System.out.println( x.longValue() );   

        //Comparison method
      System.out.println(x.compareTo(3));
      System.out.println(x.compareTo(5));
      System.out.println(x.compareTo(8)); 

        //Equals method compares objects
      System.out.println(x.equals(y));  
      System.out.println(x.equals(z)); 
      System.out.println(x.equals(a));

        //valueOf returns that type of number from a primitive
        //these are CONVERSION methods

        //integer to Double conversion
      Double c = Double.valueOf(5);

      //String to float conversion
      Float p = Float.valueOf("80");

      //Integer converted to base16 (radix) and then to integer               
      Integer g = Integer.valueOf("444",16);

      
      System.out.println(c);
      System.out.println(p);
      System.out.println(g);

        //Convert object number to String
      System.out.println(x.toString());  
      //convert primitive to String
      System.out.println(Integer.toString(12));

        //CONVERT String to double primitive (or int, or whatever)
      double f = Double.parseDouble("5");

      //Same as above, but to primitive instead of object
      int n = Integer.parseInt("444",16);

      System.out.println(f);
      System.out.println(n);

      /*

      All these methods are also available

        abs()  Returns the absolute value of the argument.

        ceil()  Returns the smallest integer that is greater than or equal to the argument. Returned as a double.

        floor()  Returns the largest integer that is less than or equal to the argument. Returned as a double.

        rint()  Returns the integer that is closest in value to the argument. Returned as a double.

        round()  Returns the closest long or int, as indicated by the method's return type to the argument.

        min(x,y)  Returns the smaller of the two arguments.

        max(x,y)  Returns the larger of the two arguments.

        exp()  Returns the base of the natural logarithms, e, to the power of the argument.

        log()  Returns the natural logarithm of the argument.

        pow()  Returns the value of the first argument raised to the power of the second argument.

        sqrt()  Returns the square root of the argument.

        sin()  Returns the sine of the specified double value.

        cos()  Returns the cosine of the specified double value.

        tan()  Returns the tangent of the specified double value.

        asin()  Returns the arcsine of the specified double value.

        acos()  Returns the arccosine of the specified double value.

        atan()  Returns the arctangent of the specified double value.

        atan2()  Converts rectangular coordinates (x, y) to polar coordinate (r, theta) and returns theta.

        toDegrees()  Converts the argument to degrees.

        toRadians()  Converts the argument to radians.

        random()  Returns a random number.
        */
   }
}