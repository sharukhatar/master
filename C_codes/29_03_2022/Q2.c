//2.Write a menu driven program to read data from  file and perform airthmatic calculation.

#include<stdio.h>
void menu(){
	printf("[1] A + B\n");
	printf("[2] A - B\n");
	printf("[3] A * B\n");
	printf("[4] A / B\n");
	printf("[5] Exit\n");
}

int main(){
	FILE *fd = fopen("s2.txt","r+");
	int ch;
	float a,b;
	fscanf(fd,"%f %f",&a,&b);
	printf("a=%f,b=%f\n",a,b);
	menu();
	do{

		scanf("%d",&ch);
		if( ch == 1){ printf("A + B is = %f\n",a+b);}
		else if( ch == 2){printf("A - B is = %f\n",a-b);}
		else if( ch == 3){printf("A * B is = %f\n",a*b);}
		else if( ch == 4){printf("A / B is = %f\n",a/b);}
		else if( ch == 5){break;}
		else{ printf("Wrong Choice\n");}

	}while(1);	

	
	
	return 0;
}

