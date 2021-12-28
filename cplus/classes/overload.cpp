#include <iostream>
using namespace std;

class Box {

//Public definitions
   public:
      double getVolume(void) {
         return length * breadth * height;
      }

//These set functions simply put the input value
//into a private variable, security?
      void setLength( double len ) {
         length = len;
      }
      void setBreadth( double bre ) {
         breadth = bre;
      }
      void setHeight( double hei ) {
         height = hei;
      }

      // Overload + operator to add two Box objects.
      //Note the overload is used to define the function.
      //This operator+ overloads the + math operator and
      //requires only one other Box address as iput 
      //Box& = address of a box object
      Box operator+(const Box& b) {
         //create a new box object
         Box box;
         //We are inside the class, so we can 
         //access private members
         // this-> means the box we created above
         box.length = this->length + b.length;
         box.breadth = this->breadth + b.breadth;
         box.height = this->height + b.height;
         return box;
         //So, you don't just define the overload,
         //You must also write the function for 
         //How it works.
      }

   private:
      double length;      // Length of a box
      double breadth;     // Breadth of a box
      double height;      // Height of a box
};

// Main function for the program
int main() {
   Box Box1;                // Declare Box1 of type Box
   Box Box2;                // Declare Box2 of type Box
   Box Box3;                // Declare Box3 of type Box
   double volume = 0.0;     // Store the volume of a box here
 
   // box 1 specification
   Box1.setLength(6.0); 
   Box1.setBreadth(7.0); 
   Box1.setHeight(5.0);
 
   // box 2 specification
   Box2.setLength(12.0); 
   Box2.setBreadth(13.0); 
   Box2.setHeight(10.0);
 
   // volume of box 1
   volume = Box1.getVolume();
   cout << "Volume of Box1 : " << volume <<endl;
 
   // volume of box 2
   volume = Box2.getVolume();
   cout << "Volume of Box2 : " << volume <<endl;

   // Add two object as follows:
   // The overload means we can use a math 
   // statement to add two Box objects together
   // We didn't really add them together, but
   // We added together both lengths and breadths
   Box3 = Box1 + Box2;

   // volume of box 3
   // Now, when we get Box3's volume, it
   // uses the larger lenght and breadth of 
   // Box1 + Box2 to calculate it.
   volume = Box3.getVolume();
   cout << "Volume of Box3 : " << volume <<endl;

   return 0;
}
