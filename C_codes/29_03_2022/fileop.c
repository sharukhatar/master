  /* #include <stdio.h>  
    main(){  
       FILE *fp;  
       fp = fopen("s.text", "w");//opening file  
       fprintf(fp, "Hello Nimesh...\n");//writing data into file  
       fclose(fp);//closing file  
    } */

 #include<stdio.h>  
    void main( )  
    {  
    FILE *fp ;  
    char ch ;  
    fp = fopen("s.txt","r") ;  
    while ( 1 )  
    {  
    ch = fgetc ( fp ) ;  
    if ( ch == EOF )  
    break ;  
    printf("%c",ch) ;  
    }  
    fclose (fp ) ;  
    }  


/*#include<stdio.h>

 int main(){ 
	// Declare the file pointer
    FILE *filePointer ;
     
    // Declare the variable for the data to be read from file
    char dataToBeRead[50];
 
    // Open the existing file GfgTest.c using fopen()
    // in read mode using "r" attribute
    filePointer = fopen("s.text", "r") ;
     
    // Check if this filePointer is null
    // which maybe if the file does not exist
    if ( filePointer == NULL )
    {
        printf( "s.test file failed to open." ) ;
    }
    else
    {
         
        printf("The file is now opened.\n") ;
         
        // Read the dataToBeRead from the file
        // using fgets() method
        while( fgets ( dataToBeRead, 50, filePointer ) != NULL )
        {
         
            // Print the dataToBeRead
            printf( "%s" , dataToBeRead ) ;
        }
         
        // Closing the file using fclose()
        fclose(filePointer) ;
         
        printf("Data successfully read from file GfgTest.c\n");
        printf("The file is now closed.") ;
    }



	return 0;
}*/

