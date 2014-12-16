#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int getReverse(int numIn){
	string s = to_string(numIn);
	string s_num;
	for(int i = 0; i < s.length(); i++){
		s_num = s[i] + s_num;
	}
	return stoi(s_num);
}
bool pal(int checkPal){
	string s = to_string(checkPal);
	int start = 0;
    int end = s.length()-1;
    while (start < end){
		if (s[start]!=s[end])
			return false;
		++start;
		--end;
	}
	return true;
}
int main(int argc, char** argv){
	ifstream file(argv[1]);
    string str;

	while (getline(file, str)){
		if(str.length() > 0){
			int initNum = stoi(str);
			int count = 0, reverse = initNum;
			bool palin = false;
			bool test = pal(initNum);

			while(!palin){
				count++;
				reverse += getReverse(reverse);
				if(pal(reverse)==true)
					palin = true;
			}
			cout << count << " " << reverse << endl;
		}
	}
}