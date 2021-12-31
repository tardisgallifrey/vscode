#include <stdio.h>
/*
Cmake will write a new TutorialConfig.h
and stick it in the /build folder

So, you include the real .h not the .h.in file
*/
#include "TutorialConfig.h"

/* Try not to forget how to do command line args */
int main(int argc, char *argv[]){

    if (argc < 2) {
    /*report version*/
    printf("%s Version %d . %d \n", argv[0],Tutorial_VERSION_MAJOR,Tutorial_VERSION_MINOR);
    printf("Usage: %s \n", argv[0]);
    }

    printf("Hello World.\n");
    return 0;
}