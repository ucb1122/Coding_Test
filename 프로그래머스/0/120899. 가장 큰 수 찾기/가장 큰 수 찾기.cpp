#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> array) {
    vector<int> answer;
    
    auto maxIt = max_element(array.begin(), array.end());
    int maxValue = *maxIt;
    int maxIndex = maxIt - array.begin();
    
    answer.push_back(maxValue);
    answer.push_back(maxIndex);
    
    return answer;
}