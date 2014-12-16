#include <iostream>
#include <string>
#include <fstream>
#include <stack>
using namespace std;

int main(int argc, char** argv){
	ifstream file(argv[1]);
    string str;
	stack <string> words;
	 while (getline(file, str)){
		 if(str.length() > 0){
			string strCh[30] = {};
			int count = 0;
			for(int i = 0; i <= str.length(); i++){
				if(str[i] != ' ' && str[i] != '\0')
					strCh[count] += str[i];
				else{
					words.push(strCh[count]);
					count++;
				}
			}
			while(words.size() != 0){
				cout << words.top() << " ";
				words.pop();
			}
		 }
		 cout << endl;
	 }
}