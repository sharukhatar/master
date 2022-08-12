#include<stdio.h>
#include"ACTs.h"

void input(struct Course* cr,int* num){
	printf("Enter course Id: ");
	scanf("%d",&cr[*(num)].course_id);
	printf("enter the course name: ");
	scanf("%s",cr[*(num)].course_name);
	printf("Enter the number of students: ");
	scanf("%d",&cr[*(num)].no_student);
	for(int i=0;i<2;i++){
		prinf("Enter modules details %d: ",i)
		printf("\tEnter module id: ");
		scanf("%d",&cr[*(num)].modules[i].modules_id);
		printf("\tEnter module name: ");
		scanf("%s",cr[*(num)].modules[i].modules_name);
		printf("\tEnter module hrs: ");
		scanf("%d",&cr[*(num)].modules[i].hrs);
	}
	(*num)++;
	
}

void display(struct Course* cr,int* num){
	printf("Course details\n:");
	for(int i=0;i<(*num);i++){
		printf("Course : %d | %s | %d \n",cr[i].course_id,cr[i].course_name,cr[i].no_student);
		for(int j=0;j<2;j++){
		printf("\t Module %d | %s | %d \n",cr[i].modules[j].module_id,cr[i].modules[j].module_name,cr[i].modules[j].hrs);		
		}
	}
}

int main(){
	struct Course crs[10];
	int no_crs=0;
	
	input(crs, &no_crs);
	
	return 0;
}
