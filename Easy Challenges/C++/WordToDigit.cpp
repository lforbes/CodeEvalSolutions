#include <iostream>
#include <string>
#include <fstream>

using namespace std;

int main(int argc, char** argv){
	ifstream file(argv[1]);
    string str;
	
    while (getline(file, str)){
			string strCh[20] = {};
			int count = 0;
			for(int i = 0; i<str.length(); i++){
				if(str[i] != ';')
					strCh[count] += str[i];
				else
					count++;
			}
			for(int j = 0; j <= count; j++){
				if(strCh[j] == "zero")
					cout << "0";
				else if(strCh[j] == "one")
					cout << "1";
				else if(strCh[j] == "two")
					cout << "2";
				else if(strCh[j] == "three")
					cout << "3";
				else if(strCh[j] == "four")
					cout << "4";
				else if(strCh[j] == "five")
					cout << "5";
				else if(strCh[j] == "six")
					cout << "6";
				else if(strCh[j] == "seven")
					cout << "7";
				else if(strCh[j] == "eight")
					cout << "8";
				else if(strCh[j] == "nine")
					cout << "9";
			}
		cout << endl;
    }
	return 0;
}