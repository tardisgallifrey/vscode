#include <iostream>

//Do not put a namespace spec above preprocessor area
#define NUMBER_OF_PARTS 500

//using-s need a semicolon
using namespace std;


//Use an enum class.  It's simpler, mostly
enum class Rainbow {red, green, blue, purple};

int main(){
    float inventory[NUMBER_OF_PARTS];

    Rainbow color = Rainbow::blue;

    if(color == Rainbow::blue){
        cout << "The color of the rainbow chosen is blue." << endl;
    }

    color = Rainbow::purple;

    if(color == Rainbow::purple){
        cout << "The color of the rainbow chosen is purple." << endl;
    }
}