// C++ program to illustrate the
// include guards
#include "Animal.h"
#include "Dog.h"
#include <iostream>
using namespace std;

// Driver Code
int main()
{
	// Object of Dog class in
	// "Dog.h" header file
	Dog a;

	// Member Function Call
	a.dog_input();
	a.dog_display();

	return 0;
}

