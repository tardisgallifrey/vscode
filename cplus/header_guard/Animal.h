//Include guard
//Here is how this works, I think:
//First time that g++ sees Animal.h,
//_Animals_ not defined is true, therefore,
//define _Animals_ and process file.
//
//Next time that g++ sees Animal.h,
//_Animals_ not defined is false, therefore,
//skip to #endif and skip processing this file.
//
//No matter how many times g++ sees this file after
//defining _Animals_, it will not process this file.
//g++ will not error.  Works in C, too.
#ifndef _Animals_
#define _Animals_

// C++ program to create a header
// file named as "Animal.h"
#include <iostream>
#include <string>
using namespace std;

// Animal Class
class Animal {
	string name, color, type;

public:
	// Function to take input
	void input()
	{
		name = "Dog";
		color = "White";
	}

	// Function to display the member
	// variables
	void display()
	{
		cout << name << " is of "
			<< color << endl;
	}
};
//End of include guard
#endif

