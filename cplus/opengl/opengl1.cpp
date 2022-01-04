#include <GL/gl.h>
#include <GL/glu.h>
#include <GL/glut.h>
#include <iostream>

void DisplayScene(){
    glClear(GL_COLOR_BUFFER_BIT);
    glutSwapBuffers();
}

int main(){

    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGBA);
    glutInitWIndowSize(800,600);
    glutInitWindowPosition(100,100);
    glutCreateWindow("Tutorial 01");
    glutDisplayFunc(DisplayScene);
    glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
    glutMainLoop();
}
