#include<iostream>
#include<string>
#include<cstdlib>

using namespace std;

int main()
{
	string str = "vtypeauto.0";
	//int pos = (int) (str.length()-2);
	//string substring1 = str.substr(5,4);
	if(str.substr(5,4).compare("auto") == 0){
		cout << "The string is matching"<< endl;
		int dotIndex = str.find_last_of('.');
		string strId = str.substr(dotIndex + 1);
    		int num = strtol(strId.c_str(), 0, 10);
		cout << "The number is = "<< num << endl;
	}
}
