#include <iostream>
#include <csignal>

using namespace std;
//C# has a lot of classes of event  handlers
//and built in events
//
//C++ only has a few, but they can be used
//to do event handling.

//SIGINT responds to machine interrupts


//Anything that raises SIGINT makes this run
void signalHandler( int signum ) {
   cout << "Interrupt signal (" << signum << ") received.\n";

   // cleanup and close up stuff here  
   // terminate program  

   exit(signum);  
}

int main () {
   // register signal SIGINT and signal handler  
   // registering is like binding
   signal(SIGINT, signalHandler);  

   while(1) {
      cout << "Going to sleep...." << endl;
      sleep(1);
   }

   return 0;
}