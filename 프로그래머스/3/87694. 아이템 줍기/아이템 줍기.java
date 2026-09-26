import java.util.*;

class Solution {
    
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    
    // 원래 전체 크기는 최대 50 x 50 이지만, 2배 확장.
    // 처음 이부분 이해가 안 됐는데, 만약 좌표 점으로만 구분하게 된다면 안에 비어있는 부분을 구분할 수 없기 때문에 2배로 늘려서 안을 채워 넣어야 된다. (문제 경우: (1,2) (2,2) (1,1) (2,1))
    int[][] board = new int[101][101]; // 전체 크기보다 1크게 만들어야 된다. 
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        
        double_fill(rectangle, 1); // 모든 사각형 영역을 2배 넓히고 1로 채우기

        double_fill(rectangle, 0); // 사각형 내부를 0으로 지워서 테두리만 남긴다
        
        answer = double_character_item(characterX, characterY, itemX, itemY);
        
        return answer;
    }
    
    public void double_fill(int[][] rectangle, int target) {
        for (int[] rect : rectangle) {
             int leftX = rect[0] * 2;
             int leftY = rect[1] * 2;
             int rightX = rect[2] * 2;
             int rightY = rect[3] * 2;

            if (target == 0) { // 0으로 채우기
            for (int x = leftX + 1; x < rightX; x++) {
                for (int y = leftY + 1; y < rightY; y++) {
                    board[x][y] = target;
                    }
                }
            } else { //1로 채우기
            for (int x = leftX; x <= rightX; x++) {
                for (int y = leftY; y <= rightY; y++) {
                    board[x][y] = 1;
                    }
                }
            }
        }
    }
    
    public int double_character_item(int characterX, int characterY, int itemX, int itemY) {
        int startX = characterX * 2;
        int startY = characterY * 2;
        int targetX = itemX * 2;
        int targetY = itemY * 2;

        // bfs로 구한 거리는 2배 좌표 기준이므로 마지막에 2로 나눈다
        return bfs(board, startX, startY, targetX, targetY) / 2;
    }
    
    public int bfs(int[][] board, int startX, int startY, int targetX, int targetY) { 
        boolean[][] visited = new boolean[101][101];
        Queue<int[]> queue = new LinkedList<>();

        // x좌표, y좌표, 현재까지 이동 거리
        queue.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            int x = current[0];
            int y = current[1];
            int distance = current[2];

            // 아이템 위치에 도착하면 현재까지의 거리 return
            if (x == targetX && y == targetY) {
                return distance;
            }

            // 상하좌우 탐색
            for (int direction = 0; direction < 4; direction++) {
                int nextX = x + dx[direction];
                int nextY = y + dy[direction];

                // 범위 밖이면 무시
                if (nextX < 0 || nextY < 0 || nextX >= 101 || nextY >= 101) {
                    continue;
                }

                // 이미 방문한 곳이면 무시
                if (visited[nextX][nextY]) {
                    continue;
                }

                // 테두리가 아니면 이동 불가
                if (board[nextX][nextY] != 1) {
                    continue;
                }

                visited[nextX][nextY] = true;
                queue.offer(new int[]{nextX, nextY, distance + 1});
            }
        }
        return 0;    
    
    }
}