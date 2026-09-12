#include <string>
#include <vector>

using namespace std;

int dfs(int index, int sum, const vector<int>& numbers, int target) {
    if (index == numbers.size()) {
        return (sum == target) ? 1 : 0;
    }
    
    return dfs(index + 1, sum + numbers[index], numbers, target) + 
           dfs(index + 1, sum - numbers[index], numbers, target);
}

int solution(vector<int> numbers, int target) {
    return dfs(0, 0, numbers, target);
}