#include <string>
#include <vector>
#include <unordered_map>
#include <algorithm>

using namespace std;

int solution(int k, vector<int> tangerine) {
    int answer = 0;
    
    unordered_map<int, int> counts;
    for (int size : tangerine) {
        counts[size]++;
    }
    
    vector<int> freq;
    for (auto const& [size, count] : counts) {
        freq.push_back(count);
    }
    
    sort(freq.begin(), freq.end(), greater<int>());
    
    for (int count : freq) {
        k -= count;
        answer++;
        
        if (k <= 0) {
            break;
        }
    }
    return answer;
}