//Same as C, except names are different
//iostream = stdio.h
#include <iostream>

//Controversial
//Some say do not use for security (?)
//Yet, naming is easier by using
using namespace std;


//same as C
int main()
{

  //C doesn't have a string type.  C++ does.
  string firstName="Dave\n";
  int temperature=25;

        //cout is quick and dirty.  printf still here, I think.
	cout << "Hello World!\n";
	cout << firstName;
	cout << temperature;
	cout <<"\n";
	return 0;
}
