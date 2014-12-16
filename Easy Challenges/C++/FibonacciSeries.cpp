#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int main(int argc, char** argv){
	ifstream file(argv[1]);
    string str;
	int numIn;

	while (getline(file, str)){
		if(str.length() > 0){
			int num0 = 0, num1 = 1, count = 1, numOut = 0;
			numIn = stoi(str);
			if(numIn != 0 && numIn != 1){
				while(count < numIn){
					numOut = num0 + num1;
					num0 = num1;
					num1 = numOut;
					count++;
				}
				cout << numOut << endl;
			}
			else if(numIn == 0)
				cout << "0" << endl;
			else
				cout << "1" << endl;
			}
		else
			cout << " " << endl;
	}
}