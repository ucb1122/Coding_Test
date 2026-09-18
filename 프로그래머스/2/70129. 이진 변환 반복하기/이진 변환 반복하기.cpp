#include <string>
#include <vector>

using namespace std;

string toBinary(int n) {
    string res = "";
    while (n > 0) {
        res = to_string(n % 2) + res;
        n /= 2;
    }
    return res;
}

vector<int> check(int count, int remove, string s) {
    if (s == "1") {
        return {count, remove};
    }

    string str = ""; 

    for (int i = 0; i < s.size(); i++) {
        char ch = s[i]; 
        if(ch == '0') {   
            remove++;
        } else {
            str += ch; 
        }
    }
    
    count++;
    
    string next_s = toBinary(str.size());
    
    return check(count, remove, next_s); 
}

vector<int> solution(string s) {
    return check(0, 0, s);
}