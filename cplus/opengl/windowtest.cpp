#include <GL/gl.h>
#include <GL/glu.h>
#include <GL/glut.h>
#include <iostream>
#include "setbackground.h"
#include "createwindow.h"

using namespace std;


void display() {
   
   SetBg background;

   background.White();
 
   glFlush();  // Render now
}
 
/* Main function: GLUT runs as a console application starting at main()  */
int main(int argc, char** argv) {
   glutInit(&argc, argv);                 // Initialize GLUT

   Create NewWin;

   NewWin.Window("My New Title", 1200, 1200, 1, 1);
   
   glutDisplayFunc(display); // Register display callback handler for window re-paint
   glutMainLoop();           // Enter the infinitely event-processing loop
   return 0;
}

