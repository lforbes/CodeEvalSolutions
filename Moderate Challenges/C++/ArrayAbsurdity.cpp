#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int main(int argc, char** argv){
	ifstream file(argv[1]);
    string str;

	while (getline(file, str)){
		//cout << str << endl;
		string temp;
		int i = 0, duplicate = -1;
		int size;
		bool sizeCheck = false, noDup = false;
		if(str.length() > 0){
			for(i; !sizeCheck; i++){ // Get size of array
				if(str[i] != ';')
					temp += str[i];
				else
					sizeCheck = true;
			}
			size = stoi(temp);
			int nums[100] = {};
			int count = 0;
			temp = "";
			
			for(int j = i; j <= str.length(); j++){
				if(str[j] != ',' && str[j] != '\0')
					temp += str[j];
				else{
					nums[count] = stoi(temp);
					count++;
					temp = "";
				}
			}
			bool found = false;
			noDup = false;
			while(!found){
				for(int k = 0; k < size; k++){
					for(int l = k+1; l < size; l++){
						if(nums[l] == nums[k]){
							duplicate = nums[k];
							found = true;
						}
					}
					if(k==size-1 && found==false){
							found=true;
							noDup = true;
					}
				}
			}
			if(!noDup)
			//cout << "Dup: " << duplicate << endl;
				cout << duplicate << endl;
		}	
	}
}