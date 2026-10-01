import java.util.*;

class Solution {
    
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    
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

            isVisited[x][y] = true;     
            
            for (int i = 0; i < 4; i++) {
                
                int ndx = x + dx[i]; 
                int ndy = y + dy[i];
                
                if(ndx == row - 1 && ndy == col - 1) {
                    return distance + 1; 
                }
                
                if(ndx < 0 || ndy < 0 || ndx >= row || ndy >= col) {
                    continue;
                }
                
                if(isVisited[ndx][ndy]) {
                    continue;
                }
                
                if(maps[ndx][ndy] == 0) {
                    continue;
                }
                
                isVisited[ndx][ndy] = true;
                que.add(new int[] {ndx, ndy, distance + 1});
            }
        }
        return -1; 
    }
}