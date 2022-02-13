#ifndef _BACKGROUND_
#define _BACKGROUND_

//This is atrocious really, but it's a start
class SetBg{

   public:
      void Black(){
         glClearColor(0.0f, 0.0f, 0.0f, 1.0f); // Set background color to black and opaque
         glClear(GL_COLOR_BUFFER_BIT);         // Clear the color buffer
      }

      void White(){
         glClearColor(1.0f, 1.0f, 1.0f, 1.0f); // Set background color to black and opaque
         glClear(GL_COLOR_BUFFER_BIT);         // Clear the color buffer
      }
};
#endif
