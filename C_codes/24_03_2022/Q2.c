/*Q2. Create a structure for student/employee information with suitable
members and do the following
- Creating variables, input, output operations
- create a pointer of struct type, and assign address of variable
- access members from the pointer using arrow operator
- create alias for the structure type, pointer type using typedef*/

#include<stdio.h>

int main(){

	struct student{
		int prn;
		char name[100];
		int assignment;
	};
	typedef struct student stud;
	stud s1;
	stud* pt = &s1;
	
	stud s2;
	stud* pt1 = &s2;
	
 	
	printf("Enter the prn number of student 1 : ");
	scanf("%d",& pt->prn);
	printf("Enter the name of student 1 : ");
	scanf("%s",pt->name);
	printf("Enter the number of assignments of student 1 : ");
	scanf("%d",& pt->assignment);
	printf("\n---------------------------------------------------------------\n");
	
	printf("Enter the prn number of student 2 : ");
	scanf("%d",& pt1->prn);
	printf("Enter the name of student 2 : ");
	scanf("%s",pt->name);
	printf("Enter the number of assignments of student 2 : ");
	scanf("%d",& pt->assignment);
	printf("\n---------------------------------------------------------------\n");
	
	
	printf("student 1 details-> : %d|%s|%d \n", pt->prn, pt->name, pt->assignment);
	
	printf("student 2 details-> : %d|%s|%d \n", pt1->prn, pt1->name, pt1->assignment);

                                                                                                                                                              
	return 0;
}


