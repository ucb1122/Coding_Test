#include <string>
#include <sstream>
#include <algorithm>

using namespace std;

string solution(string s) {
    stringstream ss(s);
    int num;
    
    ss >> num;
    int min_num = num;
    int max_num = num;
    
    while (ss >> num) {
        min_num = min(min_num, num);
        max_num = max(max_num, num);
    }
    
    return to_string(min_num) + " " + to_string(max_num);
}