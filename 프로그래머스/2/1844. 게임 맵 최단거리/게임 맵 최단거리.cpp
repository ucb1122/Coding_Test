#include<vector>
#include<bits/stdc++.h>

using namespace std;

vector<int> dx = {-1, 1, 0, 0};
vector<int> dy = {0, 0, -1, 1};

int bfs(vector<vector<int>>& maps, vector<vector<bool>>& is_visited, int row, int col) {
    queue<vector<int>> que;
    
    que.push({0, 0, 1});
    is_visited[0][0] = true;
    
    while(!que.empty()) {
        vector<int> now = que.front();
        que.pop();
        
        int x = now[0];
        int y = now[1];
        int distance = now[2];
        
        if (x == row -1 && y == col - 1) {
            return distance; 
        }
        
        for (int i = 0; i < 4; i++) {
            int ndx = x + dx[i];
            int ndy = y + dy[i];
            
            if (ndx < 0 || ndy < 0 || ndx >= row || ndy >= col) {
                continue;
            }
            
            if (is_visited[ndx][ndy]) {
                continue;
            }
            
            if (maps[ndx][ndy] == 0) {
                continue;
            }
            
            que.push({ndx, ndy, distance + 1});
            is_visited[ndx][ndy] = true;
        }
    }
    return -1;
}

int solution(vector<vector<int> > maps)
{
    int row = maps.size();
    int col = maps[0].size();
    
    vector<vector<bool>> is_visited(row, vector<bool> (col, false));
    
    vector<int> current= {0, 0, 1};
    
    return bfs(maps, is_visited, row, col);
}