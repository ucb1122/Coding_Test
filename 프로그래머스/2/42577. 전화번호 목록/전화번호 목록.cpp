#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

bool solution(vector<string> phone_book) {
    unordered_map<string, int> map;
    
    for (const string& phone : phone_book) {
        map[phone] = 0;
    }

    for (const string& phone : phone_book) {
        for (int j = 1; j < phone.length(); j++) {
            string prefix = phone.substr(0, j);
            
            if (map.count(prefix)) {
                return false;
            }
        }
    }
    return true;
}