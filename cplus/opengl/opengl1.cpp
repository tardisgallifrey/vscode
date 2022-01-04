//To make it easier,
//I created a common header file 
//with all includes
#include "graphics.h"

//Namespace is not currently needed

//Functions and/or classes like this is where
//OpenGL occurs.

//This is our callback function to glutDisplayFunc
//Smallest possible.  Does nothing, really
void DisplayScene(){
    glClear(GL_COLOR_BUFFER_BIT);
    glutSwapBuffers();
}


//None of this is OpenGL, even though it came from
//them.  GLUT is just how we make windows work.

//command line args are necessary
int main(int argc, char *argv[]){

//Initialize glut
    glutInit(&argc, argv);
//Initialize Display Mode
//GLUT_DOUBLE = double buffering, drawing to
//background while displaying foreground, then swap
//GLUT_RGBA = four color (red, green, blue, alpha) 
//Lots of others, too
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGBA);
//Initialize Window size
    glutInitWindowSize(800,600);
//set location of upper left hand corner of window frame
    glutInitWindowPosition(100,100);
//Create Window and give it title
//All window set up things must go before here
    glutCreateWindow("Tutorial 01");
//Call our display function
    glutDisplayFunc(DisplayScene);
//Set background color, alpha is trasnparency
    glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
//Call the window frame Main Loop to run window
    glutMainLoop();
}
