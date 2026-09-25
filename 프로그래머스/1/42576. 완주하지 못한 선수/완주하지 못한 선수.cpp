#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    string answer = "";
    unordered_map<string, int> hash_map;
    
    for (string name : participant) {
        hash_map[name]++;
    }
    
    for (string name : completion) {
        hash_map[name]--;
    }
    
    for (auto pair : hash_map) {
        if (pair.second > 0) {
            return pair.first;
        }
    }
    return "";
}