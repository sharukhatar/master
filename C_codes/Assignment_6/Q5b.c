/*Q5. Define your own iterative functions for
(using array notation as well as exclusively using pointers)
b) concatenation*/


#include<stdio.h>

void concat(char *str1, char *str2){
    char*join1 =str1;
    char*join2 =str2;
    while(*join1){
        join1++;
    }
    while(*join2){
       *join1=*join2;
        join1++;
        join2++;
        
    }
    *join1='\0';
}

int main(){
    char str1[100];
    char str2[100];
    printf("\n Enter the first string : \n");
    scanf("%s",str1);
    printf("\n Enter the second string : \n");
    scanf("%s",str2);
    concat(str1,str2);
    printf("%s",str1);
    
    
    return 0;
    
}

