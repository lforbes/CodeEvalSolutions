#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int main(int argc, char** argv){
	ifstream file(argv[1]);
    string str;
	while (getline(file, str)){
		if(str.length() > 0){
			char letters[100] = {};
			int checker[100] = {};
			for(int i = 0; i <= str.length(); i++){
				letters[i] = str[i];
			}
			for(int i = 0; i < str.length(); i++){
				for(int j = i+1; j < str.length(); j++){
					if(letters[j] == letters[i]){
						checker[i] = 1;
						checker[j] = 1;
					}
				}
			}
			for(int i = 0; i < str.length(); i++){
				if(checker[i] == 0){
					cout << letters[i] << endl;
					break;
				}
			}
		}
	}
}