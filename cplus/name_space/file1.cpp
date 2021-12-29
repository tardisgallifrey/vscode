#include <iostream>
#include "class1.cpp"

using namespace std;

int main(){

    cout << "Hello World, Main File." << endl;
    first::FirstClass obj;
    obj.display();
}