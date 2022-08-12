//4.Write a program to convert a given character to lowercase
//All uppercasecase characters ASCII value is from 65 to 96 and if we add 32 in each uppercase character only then it will become lowercase character.
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
    if (ch>=65 && ch<=96)
    {  
          ch = ch+32; 
          printf ("\n lowercase of Entered character is %c", ch);
    }
    else
    {
          printf("\n You Already Entered lowercase Character");
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
