#include <iostream>
#include <string>
#include <fstream>
using namespace std;

char lowercase(char in){
  if(in <= 'Z' && in >= 'A')
    return in-('Z' - 'z');
  return in;
} 
int main(int argc, char** argv){
	ifstream file(argv[1]);
    string str;
	while (getline(file, str)){
		 if(str.length() > 0){
			 for(int i = 0; i < str.length(); i++){
				 cout << lowercase(str[i]);
			 }
			 cout << endl;
		 }
	 }
}