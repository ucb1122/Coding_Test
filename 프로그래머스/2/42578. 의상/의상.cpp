#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

int solution(vector<vector<string>> clothes) {
    int answer = 1;
    unordered_map<string, int> hash_map;
    
    for (vector<string> c : clothes) {
        hash_map[c[1]]++;
    }
    
    for (auto pair : hash_map) {
        int num = pair.second;
        answer *= (num + 1);
    }
    return answer - 1;
}