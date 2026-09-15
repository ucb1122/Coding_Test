#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr) {
    if (arr.size() == 1) {
        return {-1};
    }
    
    auto min_iter = min_element(arr.begin(), arr.end());
    
    arr.erase(min_iter);
    
    return arr;
}