//Q1. create employee strcture.
	
	struct Date{
	int day;
	int month;
	int year;
	}Date;
	struct Address{
	int flatno;
	char City[100];
	char State[100];
	}Address;
	struct Employee{
	char name[100];
	int Empid;
	struct Date DOB;
	struct Address add;
