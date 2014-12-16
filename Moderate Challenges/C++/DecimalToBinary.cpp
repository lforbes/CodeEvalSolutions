#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int main(int argc, char** argv){
	ifstream file(argv[1]);
    string str;

	while (getline(file, str)){
		string bin;
		if(str.length() > 0){
			int dec = stoi(str);
			if(dec == 0)
				cout << 0 << endl;
			if(dec == 1)
				cout << 1 << endl;

			while(dec != 0){
				if(dec % 2 == 0){
					if(dec != 1)
						bin = "0" + bin;
					else
						bin = "1" + bin;
				}
				else
					bin = "1" + bin;

				dec = dec / 2;
			}
			cout << bin << endl;
		}
	 }
}