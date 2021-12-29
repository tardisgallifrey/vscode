#include <iostream>
#include <string>

using namespace std;

//Without a template, we would have to write
//a function that returns an int, a function 
//that returns a float, a function that returns a string.
//
//With a template, the typename T allows substition
//of different types for the a and b constants
template <typename T>
inline T const& Max (T const& a, T const& b) { 
    //conditional:
    //for a < b, return b if true, a if false
   return a < b ? b:a; 
}

int main () {
   int i = 39;
   int j = 20;
   //This time, Max works on integers
   cout << "Max(i, j): " << Max(i, j) << endl; 

   double f1 = 13.5; 
   double f2 = 20.7; 
   //This time, Max works on floats
   cout << "Max(f1, f2): " << Max(f1, f2) << endl; 

   string s1 = "Hello"; 
   string s2 = "World"; 
   //This time Max works on strings.
   cout << "Max(s1, s2): " << Max(s1, s2) << endl; 

   return 0;
}