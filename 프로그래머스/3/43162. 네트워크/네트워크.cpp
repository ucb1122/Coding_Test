#include <string>
#include <vector>

using namespace std;

void dfs(int current, vector<vector<int>> computers,  vector<bool>& isVisited, int n) {
    isVisited[current] = true;
    
    for (int i = 0; i < n; i++) {
        if (i != current && computers[current][i] == 1 && !isVisited[i]) {
            dfs(i, computers, isVisited, n);
        }
    }
}


int solution(int n, vector<vector<int>> computers) {
    int answer = 0;
    
    vector<bool> isVisited(n);
    
    for (int i = 0; i < n; i++) {
        if (!isVisited[i]) {
            dfs(i, computers, isVisited, n);
            answer++;
        }
    }
    return answer;
}