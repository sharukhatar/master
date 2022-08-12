#include<stdio.h>
	int main(){
	int arr[5];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	
	printf("arr = %x\n",arr);
	printf("&arr = %x\n",&arr);
	printf("*arr = %d\n",*arr);

	return 0;	
}
