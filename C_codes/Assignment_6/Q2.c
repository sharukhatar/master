
#include <stdio.h>


void swap(int, int);

void swap2(int*,int*);

int main()
{
    int a, b;
    
    printf("\nEnter the first number = ");
    scanf("%d",&a);
    printf("\nEnter the second number = ");
    scanf("%d",&b);
    
    printf("\n%d and %d are number before swapping\n",a,b);
    swap(a,b);
    swap2(&a,&b);
    
    

    return 0;
}
// by using call by value
void swap(int a, int b){
    int temp = a;
    a=b;
    b=temp;
    printf("\n%d and %d are number after swapping with the call by value \n",a,b);
}
// by using call by reference
void swap2(int *a, int *b){
    int temp = *a;
    *a=*b;
    *b=temp;
    printf("\n%d and %d are number after swapping with the call by reference \n",*a,*b);
}
