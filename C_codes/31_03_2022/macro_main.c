#include<stdio.h>
#include"macro_cal.h"

void cal(int a,int b){ 
    
    printf("a + b = %d \n",Add(a,b));
	printf("a - b = %d \n",Sub(a,b));
	printf("a * b = %d \n",Mul(a,b));
	printf("a / b = %d \n",Div(a,b));
	
}
