//1.Write a program to calculate the area and circumference of circle by using functions.
#include <stdio.h>
const float pi=3.14;


float area(float radius){
	float a;
	a=pi*radius*radius;
    return a;
}
float circumference(float radius){
	float b;
	b=2*pi*radius;
    return b;
}
int main()
{
    float a, b, radius;
    printf("Enter the radius of the circle :");
    scanf("%f",&radius);
    a=area(radius);
    b=circumference(radius);
    printf("The area of the circle is (%.3f meter square) and the circumference of the circle is (%.3f meter)", a, b);

    return 0;
}

