#ifndef _CLASS1_
#define _CLASS1_

#include <iostream>

using namespace std;

namespace first {

    class FirstClass {
        public:
           void display(){
              cout << "Hello from inside namespace First." << endl;
            }  
    };

}
#endif