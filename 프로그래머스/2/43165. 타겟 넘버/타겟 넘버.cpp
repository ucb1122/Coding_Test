#include <string>
#include <vector>

using namespace std;

int answer = 0;

void dfs(int current, int sum, vector<int> numbers,  int target) {
    if (current == numbers.size()) {
        if (sum == target) {
            answer++;
            return;
        }
    } else {
        dfs(current + 1, sum + numbers[current], numbers, target);
        dfs(current + 1, sum - numbers[current], numbers, target);
    }
}

int solution(vector<int> numbers, int target) {
        
    int sum = 0;
    int current = 0;

    dfs(current, sum, numbers, target);

    return answer;

}