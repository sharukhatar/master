//2.Write a program to convert Fahrenheit to celcius

#include <stdio.h>
float input(){
    float a;
    printf("Enter the temperature in the fahrenheit :");
    scanf("%f",&a);
    return a;
    
}


float convert(float fahrenheit){
    float celsius;
    celsius=(fahrenheit-32)*5/9;
    return celsius;
    
}

int main()
{
    float fahrenheit, result;
    fahrenheit=input();
    result=convert(fahrenheit);
    printf("The temperature value in the Celsius is :%.3f°C",result);

    return 0;
}

