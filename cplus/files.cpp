#include <fstream>
#include <iostream>
using namespace std;
 
int main () {
   char data[100];

//fstream class ofstream has paramters
//
//  ios::app     (open and append)
//  ios::ate     (open, set to end of file, prepare to write)
//  ios::in      (open for read)
//  ios::out     (open for output)
//  ios::trunc   (open and empty on open)
// The above can be OR'd with | symbol

//If the above is how I think it is with the :: operator,
// ios is a namespace and out, in, etc are member classes???

   // open a file in write mode.
   ofstream outfile;
   outfile.open("afile.dat", ios::out );

   cout << "Writing to the file" << endl;
   cout << "Enter your name: "; 
   cin.getline(data, 100);

   // write inputted data into the file.
   outfile << data << endl;

   cout << "Enter your age: "; 
   cin >> data;
   cin.ignore();
   
   // again write inputted data into the file.
   outfile << data << endl;

   // close the opened file.
   outfile.close();

   //ifstream only opens for read.  No Write.
   // open a file in read mode.
   ifstream infile; 
   infile.open("afile.dat"); 
 
   cout << "Reading from the file" << endl; 
   infile >> data; 

   // write the data at the screen.
   cout << data << endl;
   
   // again read the data from the file and display it.
   infile >> data; 
   cout << data << endl; 

   // close the opened file.
   infile.close();

   return 0;
}