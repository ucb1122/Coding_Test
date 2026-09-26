#include <string>
#include <vector>

using namespace std;

void dfs(int current, vector<vector<int>> computers, int n, vector<bool>& isVisited) {
    isVisited[current] = true;
    
    for (int i = 0; i < n; i++) {
        if (current != i && computers[current][i] == 1 && !isVisited[i]) {
            dfs(i, computers, n, isVisited);
        }
    }
}

int solution(int n, vector<vector<int>> computers) {
    int answer = 0;
    vector<bool> isVisited(computers.size());
    
    for (int i = 0; i < computers.size(); i++) {
        if (!isVisited[i]) {
        dfs(i, computers, n, isVisited);
        answer++;
        }
    }
    return answer;
}