#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

void dfs(int current, int n, vector<vector<int>>& computers, vector<int>& is_visited) {
    is_visited[current] = true;
    
    for (int i = 0; i < n; i++) {
        if(computers[current][i] == 1 && !is_visited[i] && current != i) {
            dfs(i, n, computers, is_visited);
        }
    }
}

int solution(int n, vector<vector<int>> computers) {
    int answer = 0;
    
    int row = computers.size();
    int col = computers[0].size();
    
    vector<int> is_visited(n);

    for(int i = 0; i < n; i++) {
        if(!is_visited[i]) {
            dfs(i, n, computers, is_visited);
            answer++;
        }
    }
    return answer;
}