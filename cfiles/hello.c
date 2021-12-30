#include <stdio.h>
#include "TutorialConfig.h.in"


<<<<<<< HEAD
int main(){
    printf("Hello World.\n");
}
=======
int main(int argc, char* argv){

    if (argc < 2) {
    // report version
    printf("%s Version %s . %s \n",argv[0],Tutorial_VERSION_MAJOR,Tutorial_VERSION_MINOR);
    printf("Usage: %s \n", argv[0]);
    return 1;
    }

    printf("Hello World."\n);
    return 0;
}
>>>>>>> a174a826f9b63a35e2227fd48dfd5d287d690aed
