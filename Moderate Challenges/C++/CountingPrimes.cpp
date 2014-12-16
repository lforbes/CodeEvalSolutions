#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int countPrimes(int num1, int num2){
	int count = 0;
	for(int i = num1; i <= num2; i++){
		int j;
		for (j = 2; j < i; j++){
			int n = i % j;
			if (n == 0)
				break;
		}
		if(i == j)
			count++;
	}
	return count;
}
int main(int argc, char** argv){
	ifstream file(argv[1]);
    string str;
	while (getline(file, str)){
		if(str.length() > 0){
			string s_num1, s_num2;
			int count = 0;
			int num1, num2;
			bool comma = false;
			while(!comma){
				for(int i = 0; i <= str.length(); i++){
					if(str[i] != ','){
						s_num1 += str[i];
						count++;
					}
					else{
						comma = true;
						break;
					}
					s_num2 = str.substr (count+1,str.length());
				}
			}
			num1 = stoi(s_num1);
			num2 = stoi(s_num2);
			int result = countPrimes(num1, num2);
			cout << result << endl;
		}
	}
}