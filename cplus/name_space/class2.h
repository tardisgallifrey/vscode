#ifndef _CLASS2_
#define _CLASS2_


#include <iostream>

using namespace std;

namespace second {

    class SecondClass {
        public:
           void display(){
              cout << "Hello from inside namespace Second." << endl;
            }  
    };

}
#endif