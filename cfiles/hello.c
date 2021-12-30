#include <stdio.h>
#include "TutorialConfig.h"


int main(int argc, char* argv){

    if (argc < 2) {
    // report version
    printf("%s Version %d.%d \n",argv[0],Tutorial_VERSION_MAJOR,Tutorial_VERSION_MINOR);
    printf("Usage: %s \n", argv[0]);
    return 1;
    }

    printf("Hello World.\n");
    return 0;
}
