typedef strct Module{
	int module_id;
	char module_name[50];
	int hrs;
}module;

struct course {
	int course_id;
	char name[50];
	int no_std;
	module modules[3];

};
	 
