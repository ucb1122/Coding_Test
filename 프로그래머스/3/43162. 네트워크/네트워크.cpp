#include <string>
#include <vector>

using namespace std;

void dfs(int current, int n, const vector<vector<int>>& computers, vector<bool>& isVisited) {
    isVisited[current] = true;
    for (int i = 0; i < n; i++) {
        if (computers[current][i] == 1 && !isVisited[i]) {
            dfs(i, n, computers, isVisited);
        }
    }
}

int solution(int n, vector<vector<int>> computers) {
    vector<bool> isVisited(n, false);
    int answer = 0;
    
    for (int i = 0; i<n;  i++) {
        if (!isVisited[i]) {
            dfs(i, n, computers, isVisited);
            answer++;
        }
    }
    return answer;
}
