#include <stdio.h>

int function1()
{
    static int count1 = 0; // does not intialize the value of count1 to 0 at every function call 
    count1++;
    printf("count of function 1 is %d\n", count1);
}

int function2()
{
    static int count2 = 0; // does not intialize the value of count2 to 0 at every function call
    count2++;
    printf("count of function 2 is %d\n", count2);
}

int main() {

    function1(); // print "count of function 1 is 1"
    function1(); // print "count of function 1 is 2"
    function2(); // print "count of function 2 is 1"
    function2(); // print "count of function 2 is 2"
    function2(); // print "count of function 2 is 3"
    
}


