import java.util.*;

class Solution {
    
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    
    int answer = 0;
    
    public int solution(int[][] maps) {
        
        int row = maps.length;
        int col = maps[0].length; 
        
        boolean[][] isVisited = new boolean[row][col];
        
        return bfs(maps, isVisited, row, col);
    }
    
    public int bfs(int[][] maps, boolean[][] isVisited, int row, int col) {
        Queue<int[]> que = new LinkedList<>();
        
        que.add(new int[] {0, 0, 1});
        
        while(!que.isEmpty()) {
            
            int[] now = que.poll();
            
            int x = now[0];
            int y = now[1];
            int distance = now[2];
            
            isVisited[0][0] = true;
            
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
                
                que.add(new int[]{nx, ny, distance + 1});
                isVisited[nx][ny] = true;
            }
        }
        return -1;
    }
}