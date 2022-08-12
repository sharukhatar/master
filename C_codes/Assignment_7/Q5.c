//5.Write a program to implement a interest calculator

#include<stdio.h>

void simple_int(float p, float r, float t){
    float interest;
    interest=(p*r*t)/100;
    printf("Simple interest = %0.3f",interest);
}
    
int main()
{
float p,r,t;
printf("Input principle value :\n");
scanf("%f",&p);
printf("Input Rate of interest in '%':\n");
scanf("%f",&r);
printf("Input time to find simple interest in years :\n");
scanf("%f",&t);

simple_int(p,r,t);

return 0;
}
