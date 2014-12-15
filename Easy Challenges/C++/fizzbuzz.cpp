#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int main(int argc, char** argv){
	ifstream file(argv[1]);
    string str;
	int x, y, n;
	
    while (getline(file, str)){
		//if(!file.good()) break;
		if(str.length() > 0){
			string strCh[3] = {};
			int count = 0;
			for(int i = 0; i<str.length(); i++){
				if(str[i] != ' ')
					strCh[count] += str[i];
				else
					count++;
			}
			x = stoi(strCh[0]);
			y = stoi(strCh[1]);
			n = stoi(strCh[2]);
		}
		for(int j = 1; j <= n; j++){
			if(j % x == 0 && j % y == 0)
				cout << "FB ";
			else if(j % x == 0)
				cout << "F ";
			else if(j % y == 0)
				cout << "B ";
			else
				cout << j << " ";
		}
		cout << endl;
    }
	return 0;
}