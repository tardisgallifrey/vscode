#include <iostream>
#include <GL/glew.h>
#include <GLFW/glfw3.h>
using namespace std;
using namespace glm;


int main(){
    glewExperimental = true; // Needed for core profile
    if( !glfwInit() )
    {
        cout << "Failed to initialize GLFW" << endl;
        return -1;
    }
}