#include <string>
#include <vector>

using namespace std;

int answer = 0;

void dfs(int current, vector<int>& numbers, int target, int sum) {
    if (current == numbers.size()) {
        if (sum == target) {
            answer++;
        }
        return;
    }
    dfs(current + 1, numbers, target, sum + numbers[current]);
    dfs(current + 1, numbers, target, sum - numbers[current]);
}

int solution(vector<int> numbers, int target) {
    int sum = 0; 
           
    dfs(0, numbers, target, sum);
        
    return answer;
}