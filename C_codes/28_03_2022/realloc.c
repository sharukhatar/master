#include<stdio.h>
#include<stdlib.h>
int main(){ 
	int *x = malloc(sizeof(char));
	printf("Size of x : %d \n",sizeof(*x));
	x = realloc(x,sizeof(int));
	scanf("%d",x);
	printf("Data : %d, and size is %d ",*x,sizeof(*x));
	free(x);
	return 0;
} 
