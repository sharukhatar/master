/*Q4. Create an employee structure with the following members
empid, employee name, salary, year of joining etc.
Accept the data for certain no. of employees and find their total,
average, max, min salary.
Also find out the employees with maximum, minimum service,use a
function to find service for each employee element in the array.*/

#include<stdio.h>
	int main(){
	struct employee{
		int empid;
		char name[10];
		int salary;
		int year_of_joining;
	};
	
// taking input from the user
	
	struct employee emp[100];
	int no_of_emp = 0;
		printf("Enter the total number of the employee\n");
		scanf("%d",&no_of_emp);
		printf("\n");

	for(int i =1;i<=no_of_emp;i++){
			printf("Enter the Empid of the employee %d\n",i);
			scanf("%d",&emp[i].empid);
			printf("Enter the name of the student %d\n",i);
			scanf("%s",emp[i].name);
			scanf("%s",emp[i].name);
			printf("Enter the Salary of the employee %d\n",i);
			scanf("%d",&emp[i].salary);
			printf("Enter the year of joining of the employee %d\n",i);
			scanf("%d",&emp[i].year_of_joining);
			printf("\n");
			}

//Total and average salary 

	int total=0;
	float avg=0.0;
	for(int i=1;i<=no_of_emp;i++){ 
	total=total+emp[i].salary;
		
	}	
	printf("total salary of all the employee's is : %d \n",total);
	printf("\n");

	avg= total/no_of_emp;
	printf("Average salary of Employee is : %0.2f \n",avg);
	printf("\n");

//Calculate minimum and maximum salary

	int min,max;
	min = max = emp[1].salary;
	for(int i=1;i<=no_of_emp;i++){ 
		if(emp[i].salary<emp[1].salary){ 
			min = emp[i].salary;	
		}
	
	}
	printf("Minimum salary is = %d\n",min);
	printf("\n");
	for(int i=1;i<=no_of_emp;i++){ 
		if(emp[i].salary>emp[1].salary){ 
			max = emp[i].salary;	
		}
	
	}
	printf("Maximum salary is = %d\n",max);
	printf("\n");
//Calculation of total service year of the employee
	int y = 2022,exp[no_of_emp];
	for(int i=1;i<=no_of_emp;i++){ 
		exp[i]= y -emp[i].year_of_joining;
		
	}
	for(int i=1;i<=no_of_emp;i++){ 
		printf("Experience of Employee (%d) = %d \n",i,exp[i]);
		
	}  
	printf("\n");
// Employee Details:

	for(int i=1;i<=no_of_emp;i++){ 
	printf("Employee details :| %d | %s | %d | %d \n",emp[i].empid,emp[i].name,emp[i].salary,emp[i].year_of_joining);
	}
	
	printf("\n");

		return 0;
}
