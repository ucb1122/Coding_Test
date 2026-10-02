#include <string>
#include <vector>
#include <set>

using namespace std;

void dfs(const string numbers, vector<bool> isVisited,
         int current, set<int>& candidates) {

    for (int i = 0; i < numbers.size(); i++) {
        if (isVisited[i]) {
            continue;
        }

        isVisited[i] = true;

        int next = current * 10 + (numbers[i] - '0');
        candidates.insert(next);

        dfs(numbers, isVisited, next, candidates);

        isVisited[i] = false;
    }
}

bool isPrime(int number) {
    if (number < 2) {
        return false;
    }

    for (int i = 2; i * i <= number; i++) {
        if (number % i == 0) {
            return false;
        }
    }

    return true;
}

int solution(string numbers) {
    int answer = 0;

    vector<bool> isVisited(numbers.size(), false);
    set<int> candidates;

    dfs(numbers, isVisited, 0, candidates);

    for (int number : candidates) {
        if (isPrime(number)) {
            answer++;
        }
    }
    return answer;
}