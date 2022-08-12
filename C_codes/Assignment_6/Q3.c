#include<stdio.h>
void nimesh_ka_func(int p,int q,int*r,int*s){
 	*s=p+q;
	*r=p*q;
}
int main(){
	int p, q, r, s;
	printf("Enter both the numbers\n");
	scanf("%d %d",&p, &q);
	nimesh_ka_func(p,q,&r,&s);
	printf("Sum of two number is %d\n",s);
	printf("product of two number is %d",r);

	return 0;
}

