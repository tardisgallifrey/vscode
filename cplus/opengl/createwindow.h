#ifndef _WINDOW_
#define _WINDOW_

//This is atrocious really, but it's a start
class Create{

   public:
      void Window(const char* title, int width, int height, int posy, int posx){
        glutCreateWindow(title); // Create a window with the given title
        glutInitWindowSize(width, height);   // Set the window's initial width & height
        glutInitWindowPosition(posy, posx); // Position the window's initial top-left corner
      }

      
};
#endif
