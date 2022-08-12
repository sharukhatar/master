#include<stdio.h>
#include<stdlib.h>
void square(int* x){
	int y= malloc(sizeof(int));
	
	(*y)=(*x) * (*x);

}
int main(){ 
	int *x=malloc(sizeof(int));
	printf("Enter int data");
	scanf("%d",x);

	int* a= square(x);
	printf("Data : %d\n",*(int*)x);

	return 0;


}
