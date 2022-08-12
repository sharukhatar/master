//6.Write a program to find given number is palindrome or not

#include <stdio.h>
 // reversed integer is stored in reversed variable
void check (int n)
{
  int remainder, reversed = 0, original;
  original = n;
  while (n != 0)
    {
      remainder = n % 10;
      reversed = reversed * 10 + remainder;
      n = n / 10;
    }

  // palindrome if orignal and reversed are equal
  if (original == reversed)
    {
      printf ("%d is a palindrome.", original);
    }
  else
    {
      printf ("%d is not a palindrome.", original);
    }

}


int main ()
{
  int n;
  printf ("Enter an integer: ");
  scanf ("%d", &n);
  check (n);


  return 0;
}

