import java.util.*;

class Solution {
    
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0,-1, 1 };
    
    public int solution(int[][] maps) {
        
        int row = maps.length;
        int col = maps[0].length;
        
        boolean[][] visited = new boolean[row][col];
        
        return bfs(maps, visited, row, col);
    }
    
    public int bfs(int[][] maps, boolean[][] visited, int row, int col) {
        Queue<int[]> que = new LinkedList<>();
        
        que.add(new int[]{0, 0, 1});
        
        visited[0][0] = true;
        
        while(!que.isEmpty()) {
            int[] now = que.poll();
            
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
                
                if (visited[nx][ny]) {
                    continue;
                }
                
                if (maps[nx][ny] == 0) {
                    continue;
                }
                
                visited[nx][ny] = true;
                que.add(new int[]{nx, ny, distance + 1});
            }
        }
        return -1;
    }
}