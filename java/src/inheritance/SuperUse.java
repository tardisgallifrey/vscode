package com.tardisgallifrey;

//base class
class Super_class {
   int num = 20;

   // display method of superclass
   public void display() {
      System.out.println("This is the display method of superclass");
   }
}

//Inherited class
public class SuperUse extends Super_class {
   int num = 10;

   // display method of sub class
   public void display() {
      System.out.println("This is the display method of subclass");
   }

   public void my_method() {
      // Instantiating subclass
      SuperUse sub = new SuperUse();

      // Invoking the display() method of sub class
      sub.display();

        //THIS IS THE LESSON!
      // Invoking the display() method of superclass
      super.display();

      // printing the value of variable num of subclass
      System.out.println("value of the variable named num in sub class:"+ sub.num);

      // printing the value of variable num of superclass
      System.out.println("value of the variable named num in super class:"+ super.num);
   }

   public static void main(String args[]) {
      SuperUse obj = new SuperUse();
      obj.my_method();
   }
}
