//Q1.Create a Employee structure to store the EMPID,NAME,Phone,Email,Salary.(Use array of structure)
#include<stdio.h>
int main(){

	struct employee{
		int EMPID;
		char Name[100];
		int Phone;
		char Email;
		int Salary;
		
	};
	
	struct employee s1[100];
	for(int i=1;i<=2;i++){
	printf("\nEnter the EMPID of the Employee no %d  \n",i);
	scanf("%d",&s1[i].EMPID);
	printf("\nEnter the name of the Employee no %d  \n",i);
	scanf("%s",s1[i].Name);
	
	printf("\nEnter the phone number of the Employeeno %d  \n",i);
	scanf("%d",&s1[i].Phone);
	printf("\nEnter the Email Id of the Employee no %d  \n",i);
	scanf("%s",s1[i].Email);
	
	printf("\nEnter the Salary of the Employee no %d : \n",i);
	scanf("%d",&s1[i].Salary);
	}
	for(int i=1;i<=2;i++){
	printf("Employee Details -> : %d|%s|%d|%s|%d| \n",s1[i].EMPID, s1[i].Name, s1[i].Phone,s1[i].Email, s1[i].Salary);
	}

                                                                                                                                                              
	return 0;
}


