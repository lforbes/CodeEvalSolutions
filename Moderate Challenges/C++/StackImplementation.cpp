#include <iostream>
#include <string>
#include <fstream>
#include <stack>
using namespace std;

int main(int argc, char** argv){
	ifstream file(argv[1]);
    string str;
	stack <string> nums;
	while (getline(file, str)){
		 if(str.length() > 0){
			string strCh[100] = {};
			int count = 0, even = 0;
			for(int i = 0; i <= str.length(); i++){
				if(str[i] != ' ' && str[i] != '\0')
					strCh[count] += str[i];
				else{
					nums.push(strCh[count]);
					count++;
				}
			}
			while(nums.size() != 0){
				if(even % 2 ==0)
					cout << nums.top() << " ";
				nums.pop();
				even++;
			}
		 }
		 cout << endl;
	 }
}