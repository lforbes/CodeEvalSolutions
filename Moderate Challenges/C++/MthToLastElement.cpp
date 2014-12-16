#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int main(int argc, char** argv){
	ifstream file(argv[1]);
    string str;

	while (getline(file, str)){
		int len = str.length();
		if(len > 0){
			int num;
			string c;
			char letter;
			bool findNum = false;
			while(!findNum){
				for(int i = str.length(); !findNum; i--){
					if(str[i] != ' ')
						c = str[i] + c;
					else
						findNum = true;
				}
				num = stoi(c);
				int numLen = c.length() - 1;
				int inclSpaces = num * 2;
				if(num <= (len-1)/2)
					letter = str[len - numLen - inclSpaces];
			}
			if(num <= (len-1)/2)
				cout << letter << endl;
		}
	}
}