#include<iostream>
#include<vector>
#include<string>
#include<sstream>
#include<algorithm>

using namespace std;

int main(){
	//std::string stringword = "1,2,1,3,2,2,1,3";

	std::string word = "1,2,1,3,2,2,1,3";
	vector<int> v;
	std::stringstream ss;
	ss << word;
	//vector<int> v;
	//stringstream ss(stringword);
	int value;
	while (ss >> value)
	{
	    v.push_back(value);

	    if (ss.peek() == ',')
		ss.ignore();
	}

	string str = "vtypeheter.1";
	
	if(str.substr(5,4).compare("auto") == 0){
		cout << "The string is matching auto"<< endl;
		int dotIndex = str.find_last_of('.');
		string strId = str.substr(dotIndex + 1);
    		int num = strtol(strId.c_str(), 0, 10);
		cout << "The number is = "<< num << endl;
		int count=0;
		int index=0;
		vector<int>::iterator it = v.begin();
		while(it != v.end()){
			if(*it == 1){
				cout << "*it = " << *it << endl;
				if(count == num){
					cout<<"index = " << index << endl;
					return index;
				}
				count++;
			}
			index++;
			it++;					
		}
		cout<<"index = " << index << endl;		
	}
	else if(str.substr(5,3).compare("bus") == 0){
		cout << "The string is matching bus"<< endl;
		int dotIndex = str.find_last_of('.');
		string strId = str.substr(dotIndex + 1);
    		int num = strtol(strId.c_str(), 0, 10);
		cout << "The number is = "<< num << endl;
		int count=0;
		int index=0;
		vector<int>::iterator it = v.begin();
		while(it != v.end()){
			if(*it == 3){
				cout << "*it = " << *it << endl;
				if(count == num){
					cout<<"index = " << index << endl;
					return index;
				}
				count++;
			}
			index++;
			it++;					
		}
		cout<<"index = " << index << endl;		
	}
	else{
		cout << "The string is matching heter"<< endl;
		int dotIndex = str.find_last_of('.');
		string strId = str.substr(dotIndex + 1);
    		int num = strtol(strId.c_str(), 0, 10);
		cout << "The number is = "<< num << endl;
		int count=0;
		int index=0;
		vector<int>::iterator it = v.begin();
		while(it != v.end()){
			if(*it == 2){
				cout << "*it = " << *it << endl;
				if(count == num){
					cout<<"index = " << index << endl;
					return index;
				}
				count++;
			}
			index++;
			it++;					
		}
		cout<<"index = " << index << endl;		
	}


	for (int j=0;j<v.size();j++)  //Fix variables
	{
	    cout << v.at(j) << " " ; // Can use simply v[j]
	}
	return 0;
}
