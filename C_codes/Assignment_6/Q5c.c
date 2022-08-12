/*Q5. Define your own iterative functions for
(using array notation as well as exclusively using pointers)#include<stdio.h>
c) comparision*/

int compare(char *str1, char *str2){
    	int i=0;
	while(str1[i] !='\0'){
	    if(str1[i]!=str2[i]){
	        break;
	    }
	    i++;
	}
	
	if(str1[i]=='\0' && str2[i]=='\0' ){
	    return 1;
	    
	}
	else{
	     return 0;
	}
	
		
}

int main(){
    char str1[100];
    char str2[100];
    char concatination[100];
    printf("\nEnter the first string : \n");
    scanf("%s",str1);
    printf("\nEnter the second string : \n");
    scanf("%s",str2);
   if(compare(str1,str2)){
       printf("Matched");
   }
   else {
        printf("Not matched");
   }
    
    
    return 0;
    
}

