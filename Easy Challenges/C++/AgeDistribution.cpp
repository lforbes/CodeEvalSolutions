#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int main(int argc, char** argv){
	ifstream file(argv[1]);
    string str;
	int age;
	
    while (getline(file, str)){
		age = stoi(str);
		if(age >= 0 && age <= 2)
			cout << "Still in Mama's arms" << endl;
		else if(age == 3 || age == 4)
			cout << "Preschool Maniac" << endl;
		else if(age >=5 && age <= 11)
			cout << "Elementary school" << endl;
		else if(age >= 12 && age <= 14)
			cout << "Middle school" << endl;
		else if(age >= 15 && age <= 18)
			cout << "High school" << endl;
		else if(age >= 19 && age <= 22)
			cout << "College" << endl;
		else if(age >= 23 && age <= 65)
			cout << "Working for the man" << endl;
		else if(age >= 66 && age <= 100)
			cout << "The Golden Years" << endl;
		else
			cout << "This program is for humans" << endl;
    }
	return 0;
}