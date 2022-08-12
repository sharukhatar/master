/*Q5. Define your own iterative functions for
(using array notation as well as exclusively using pointers)
a) finding length*/

#include<stdio.h>

int str_lenth(char*p){
    int count=0;
    while(*p!='\0'){
        count++;
        p++;
    }
    return count;
}

int main(){
    char str[100];
    int len;
    printf("\n Enter the string : ");
    scanf("%s",str);
    len=str_lenth(str);
    printf("the lenth of the string (%s) is : %d",str,len);
    return 0;
    
}


