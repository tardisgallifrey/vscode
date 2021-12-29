#include <iostream>
#include <vector>
#include <cstdlib>
#include <string>
#include <stdexcept>

using namespace std;

//This is a template class.
//It works similar to the template function
//However, the type needs to be given inside the 
//angle brackets when used.
template <class T>
class Stack { 
   private: 
   //This call uses the vector library
   //To create a vector object.
   //The object has built in 
   //member functions that  you can
   //see used below
      vector<T> elems;    // elements 

   public: 
      void push(T const&);  // push element 
      void pop();               // pop element 
      T top() const;            // return top element 
      
      bool empty() const {      // return true if empty.
      //Calling the empty method of a vector
         return elems.empty(); 
      } 
}; 

//This is a template member function of Stack,
//created outside of the regular class definition
//Hence the :: to connect the two
template <class T>
void Stack<T>::push (T const& elem) { 
   // append copy of passed element 
   //calling the push_back method of a vector
   elems.push_back(elem);    
} 

template <class T>
void Stack<T>::pop () { 
   if (elems.empty()) { 
      throw out_of_range("Stack<>::pop(): empty stack"); 
   }
   
   // remove last element 
   //calling the pop_back method of a vector
   elems.pop_back();         
} 

template <class T>
T Stack<T>::top () const { 
   if (elems.empty()) { 
      throw out_of_range("Stack<>::top(): empty stack"); 
   }
   
   // return copy of last element 
   //calling the back method of a vector
   return elems.back();      
} 

int main() { 
   try {
      Stack<int>         intStack;  // stack of ints 
      Stack<string> stringStack;    // stack of strings 

      // manipulate int stack 
      intStack.push(7); 
      cout << intStack.top() <<endl; 

      // manipulate string stack 
      stringStack.push("hello"); 
      cout << stringStack.top() << std::endl; 
      stringStack.pop(); 
      stringStack.pop(); 
   } catch (exception const& ex) { 
      cerr << "Exception: " << ex.what() <<endl; 
      return -1;
   } 
} 