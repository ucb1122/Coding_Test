#include<vector>
#include<queue>

using namespace std;

vector<int> dx = {-1, 1, 0, 0};
vector<int> dy = {0, 0, -1, 1};

int bfs(vector<vector<int>> maps, vector<vector<bool>> isVisited, int row, int col) {
    queue<vector<int>> que; 
    
    que.push({0, 0, 1});
    
    isVisited[0][0] = true;
    
    while (!que.empty()) {
        vector<int> now = que.front();
        que.pop();
        
        int x = now[0];
        int y = now[1];
        int distance = now[2];
        
        if (x == row - 1 && y == col - 1) {
            return distance;
        }
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx < 0 || ny < 0 || nx >= row || ny >= col) {
                continue;
            }
            
            if (isVisited[nx][ny]) {
                continue;
            }
            
            if (maps[nx][ny] == 0) {
                continue;
            }
            
            isVisited[nx][ny] = true;
            que.push({nx, ny, distance + 1});
        }
    }
    return - 1;
}


int solution(vector<vector<int> > maps)
{
    
    int row = maps.size();
    int col = maps[0].size();
    
    vector<vector<bool>> isVisited(row, vector<bool> (col, false));
    
    return bfs(maps, isVisited, row, col);
}