#include <stdio.h>
#include <stddef.h>

int
main ()
{

  union A
  {

    int x;
    int y;
    char ch;
  };
  union A a1;
  printf ("sizeof(a1) -> %d\n ", sizeof (a1));
  /*a1.x=511;
     printf("a1.x = %d\n",a1.x);
     printf("a1.y = %d\n",a1.y);
     printf("a1.ch = %d\n",a1.ch);
     a1.ch='A';
     printf("a1.x = %d\n",a1.x);
     printf("a1.y = %d\n",a1.y);
     printf("a1.ch = %d\n",a1.ch); */

  a1.x = 0xfff;
  printf ("a1.x = %x\n", a1.x);
  printf ("a1.y = %x\n", a1.y);
  printf ("a1.ch = %x\n", a1.ch);
  a1.ch = 0x1a;
  printf ("a1.x = %x\n", a1.x);
  printf ("a1.y = %x\n", a1.y);
  printf ("a1.ch = %x\n", a1.ch);

  printf ("Address of a1.x = %x\n", &a1.x);
  printf ("Address of a1.ch = %x\n", &a1.ch);
  printf ("Address of a1 = %x\n", &a1);
  printf ("offset of x = %d\n", offsetof (union A, x));
  return 0;
}
