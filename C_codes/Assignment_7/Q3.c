//3.Write a program to convert a given character to uppercase
//All lowercase characters ASCII value is from 97 to 122 and if we subtract 32 in each lowercase character only then it will become uppercase character.

#include <stdio.h> 
char input(){
    char ch;
    printf("\n Please Enter any alphabet\n");
    scanf(" %c", &ch);
    return ch;
}

void check(char ch){
    
     if (isalpha(ch) )
  {
    if (ch>=97 && ch<=122)
    {  
          ch = ch-32; 
          printf ("\n Uppercase of Entered character is %c", ch);
    }
    else
    {
          printf("\n You Already Entered Uppercase Character");
    }  
  }
  else
   {
     printf("\n Entered character is Not an Alphabet");
   }  
}
int main()
{
  char ch;
  ch=input();
  check(ch);
 return 0; 
}
