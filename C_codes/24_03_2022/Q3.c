/*Q3. In the student structure created above modify marks member as an
array(array of 5 subjects), create an array of struct variables and do
some input,output operations.(Marks of ith student in jth subject etc).Find
the student wise totals, subject wise totals.*/

#include<stdio.h>
	int main(){
		
		struct student {
			int prn;
			char name[100];
			int marks[5];
		};

		struct student std[100];
		
		// taking input for number of students
		int no_of_stud = 0;
		printf("Enter the total number of the students\n");
		scanf("%d",&no_of_stud);
		printf("\n");

		for(int i =1;i<=no_of_stud;i++){
			printf("Enter the prn number of the student %d\n",i);
			scanf("%d",&std[i].prn);
			printf("Enter the name of the student %d\n",i);
			scanf("%s",std[i].name);
			for(int j=1;j<=5;j++){
				printf("Enter the marks for the subject %d\n",j);
				scanf("%d",&std[i].marks[j]);
			}
		}
		printf("\n");
        
       		 // calculating students wise total
        	int total = 0;
        	for(int i=1;i<=no_of_stud;i++){
            		total = 0;
               		for(int j=1;j<=5;j++){
                   	total= total + std[i].marks[j];
             		 } 
            	  printf("%d->%d|%s|total marks : %d \n",i,std[i].prn,std[i].name,total);  
       		}
        	
		printf("\n");
        
		//calculating the subject wise total

		for(int i=1;i<=5;i++){
			total = 0;
			for(int j =1;j<=no_of_stud;j++){
			total = total + std[j].marks[i];		
			}
			
		  printf("total subject wise marks in %d subject is %d\n",i,total);		
		}	
        
        
	return 0;
	
}
