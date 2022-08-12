#include<stdio.h>
#define Add(x,y) (x + y)
#define Sub(x,y) (x - y)
#define Mul(x,y) (x * y)
#define Div(x,y) (x / y)

void cal(int a,int b){ 
    
    printf("a + b = %d \n",Add(a,b));
	printf("a - b = %d \n",Sub(a,b));
	printf("a * b = %d \n",Mul(a,b));
	printf("a / b = %d \n",Div(a,b));
	
}

int main(){ 
	int a,b;
	
// Input for variables
	printf("Enter the value for a = ");
	scanf("%d",&a);
	printf("Enter the value for b = ");
	scanf("%d",&b);
//calculator operation
    cal(a,b);

	return 0;
}
