#include<stdio.h>
#include<stdlib.h>
int main(){ 
	int *x = calloc(sizeof(int),5);
	for(int i=0;i<5;i++){
	printf("Enter the value for %d : ",i+1); 
	scanf("%d",&x[i]);
	
	}
	for(int i=0;i<5;i++){ 
	printf("%d->%d\n",i+1,x[i]);
	}
	return 0;
} 
