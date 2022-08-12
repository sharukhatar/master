#include <stdio.h>

int main()
{
    
    union A {
        
        int x;
        int y;
        char ch;
    };
    union A a1;
    printf("sizeof(a1) -> %d\n ",sizeof(a1));
    a1.x=10;
    printf("a1.x = %d\n",a1.x);//10
    printf("a1.y = %d\n",a1.y);//10
    printf("a1.ch = %c\n",a1.ch);//10//1byte
    


    return 0;
}

