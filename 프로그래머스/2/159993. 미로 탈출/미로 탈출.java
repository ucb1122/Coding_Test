import java.util.*;

class Solution {
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        int[] s = null, l = null, e = null;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = maps[i].charAt(j);
                if (c == 'S') s = new int[]{i, j};
                else if (c == 'L') l = new int[]{i, j};
                else if (c == 'E') e = new int[]{i, j};
            }
        }

        int toLever = bfs(maps, s, l);
        if (toLever == -1) return -1;

        int toExit = bfs(maps, l, e);
        if (toExit == -1) return -1;

        return toLever + toExit;
    }

    private int bfs(String[] maps, int[] start, int[] end) {
        int n = maps.length;
        int m = maps[0].length();
        int[][] dist = new int[n][m];
        for (int[] row : dist) Arrays.fill(row, -1);

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        Queue<int[]> q = new ArrayDeque<>();
        q.add(start);
        dist[start[0]][start[1]] = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if (cur[0] == end[0] && cur[1] == end[1]) {
                return dist[cur[0]][cur[1]];
            }
            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (maps[nx].charAt(ny) == 'X') continue;
                if (dist[nx][ny] != -1) continue;
                dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
                q.add(new int[]{nx, ny});
            }
        }
        return -1;
    }
}