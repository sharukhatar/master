#include<stdio.h>

int arr[5];
void input(){
	for(int i=0;i<5;i++){
		printf("Enter the number of quetions solved for assighnment no %d =",i);
		scanf("%d",(arr+i));
		}
}
void sum(){
	int sum = 0;
	for(int i=0;i<5;i++){
		sum=sum+*(arr+i);
	}
	printf("Total number of quetions you have solved : %d\n",sum);
}
int main(){
	printf("Enter the number of quetions you have completed from the total of 5 assignment\n");
	input();
	sum();
	return 0;
}
	
