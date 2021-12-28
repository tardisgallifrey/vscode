#include <iostream>

using namespace std;
int main () {

//For the simple method to use pointers, requires 2 vars
//Each var (regular and pointer) must match by type and size
//.e.g. char* only assigns to char of same size array(if array)
//
//Best to use string var & ptr when doing this.
   int  var1;
   int *num;
   string var2;
   string *name;

   //declares a pointer and sets it
   //to point to a space for a NEW string variable.
   string *lastName = new string;

   //cout can be chained, plus endl adds \n
   cout << "Address of var1 variable: ";
   cout << &var1 << endl;

   cout << "Address of var2 variable: " << &var2 << endl;

   var1=61;
   var2="Dave";

   num=&var1;
   name=&var2;

   *lastName="Vest";

   cout<<"Address that num points to: ";
   cout<<num<<endl;
   cout<<"Value that num points to: ";
   cout<<*num<<endl;
   cout<<"Address that name points to: ";
   cout<<name<<endl;
   cout<<"Value that name points to: ";
   cout<<*name<<endl;
   cout<<"Value that lasName points to: ";
   cout<<*lastName<<endl;

   return 0;
}
