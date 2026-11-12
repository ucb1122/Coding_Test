import java.util.*;

class Solution {
    public int solution(String[] board) {
        int n = board.length;
        int m = board[0].length();

        int sr = 0, sc = 0, gr = 0, gc = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = board[i].charAt(j);
                if (c == 'R') {
                    sr = i;
                    sc = j;
                } else if (c == 'G') {
                    gr = i;
                    gc = j;
                }
            }
        }

        int[][] dist = new int[n][m];
        for (int[] row : dist) {
            Arrays.fill(row, -1);
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{sr, sc});
        dist[sr][sc] = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];

            if (r == gr && c == gc) {
                return dist[r][c];
            }

            for (int d = 0; d < 4; d++) {
                int nr = r, nc = c;
                while (true) {
                    int tr = nr + dr[d];
                    int tc = nc + dc[d];
                    if (tr < 0 || tr >= n || tc < 0 || tc >= m) {
                        break;
                    }
                    if (board[tr].charAt(tc) == 'D') {
                        break;
                    }
                    nr = tr;
                    nc = tc;
                }
                if (dist[nr][nc] == -1) {
                    dist[nr][nc] = dist[r][c] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
        return -1;
    }
}