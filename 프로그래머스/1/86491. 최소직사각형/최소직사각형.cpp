#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<vector<int>> sizes) {
    int n = sizes.size();
    int answer = 0;
    vector<int> maxSize(n);
    vector<int> minSize(n);
    
    for (int i = 0; i < sizes.size(); i++) {
        maxSize[i] = max(sizes[i][0], sizes[i][1]);
        minSize[i] = min(sizes[i][0], sizes[i][1]);
    }
    
    answer = (*max_element(maxSize.begin(), maxSize.end()) * *max_element(minSize.begin(), minSize.end()));        
    
    return answer;
}