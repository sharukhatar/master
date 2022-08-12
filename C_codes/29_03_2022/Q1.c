//1.Write a program to write your name into the file

#include<stdio.h>

int main() { 
	
	FILE *fp;
	fp=fopen("s.txt","w");// opening the file
	fprintf(fp,"Hello sharukh\n"); //writing the data into the file
	fclose(fp);//closing the file
	


	return 0;

}
