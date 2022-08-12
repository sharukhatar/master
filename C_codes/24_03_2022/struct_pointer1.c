#include<stdio.h>
int main(){

	struct employee{
		int prn;
		char name[100];
		int assignment;
	};
	typedef struct student stud;
	stud std[10];
	stud* pt=std;
	for(int i=0;i<=2;i++){
 	
	printf("Enter the prn number of student %d : ",i);
	scanf("%d",&std[i]->prn);
	printf("Enter the name of student %d : ",i);
	scanf("%s",std[i]->name);
	printf("Enter the number of assignments of student %d : ",i);
	scanf("%d",&std[i]->assignment);
	
	}
	
	for(int i=0;i<=2;i++){
	printf("student %d details-> : %d|%s|%d \n",i,std[i]->prn, std[i]->name, std[i]->assignment);
	}

                                                                                                                                                              
	return 0;
}


