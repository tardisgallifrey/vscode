#include <iostream>
 
using namespace std;
 
// Base class
class Shape {
   public:

      //Build a base class, like this, and use virtual
      //functions in order to build an Abstract Class
      //C++ seems to call these ABC's (Abstract Base Class), and are slightly 
      //similar to C# Interfaces, but more like abstract classes.
      //In a C# abstract class, you can override base functions,
      //Which we are doing below in the derived class.
      //Yet, these virtual functions are quite useless in the base 
      //class and must be implemented in the derived class, more like
      //an Interface.

      // pure virtual function providing interface framework.
      virtual int getArea() = 0;
      void setWidth(int w) {
         width = w;
      }
   
      void setHeight(int h) {
         height = h;
      }
   
   protected:
      int width;
      int height;
};
 
// Derived classes
class Rectangle: public Shape {
   public:
      int getArea() { 
         return (width * height); 
      }
};

class Triangle: public Shape {
   public:
      int getArea() { 
         return (width * height)/2; 
      }
};
 
int main(void) {
   Rectangle Rect;
   Triangle  Tri;
 
   Rect.setWidth(5);
   Rect.setHeight(7);
   
   // Print the area of the object.
   cout << "Total Rectangle area: " << Rect.getArea() << endl;

   Tri.setWidth(5);
   Tri.setHeight(7);
   
   // Print the area of the object.
   cout << "Total Triangle area: " << Tri.getArea() << endl; 

   return 0;
}