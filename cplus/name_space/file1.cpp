#include <iostream>
#include "class1.cpp"
#include "class2.cpp"

using namespace std;
using namespace second;

int main(){

    //Run our main code
    cout << "Hello World, Main File." << endl;

    //Instantiate our class from first namespace
    //and call it
    first::FirstClass obj;
    obj.display();

    //Instantiate our class from second namespace
    //and call it
    SecondClass obj2;
    obj2.display();
}