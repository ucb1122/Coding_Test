import java.util.*;

class Solution {
    public int solution(int[][] game_board, int[][] table) {
        int n = game_board.length;

        boolean[][] visited1 = new boolean[n][n];
        List<List<int[]>> holes = new ArrayList<>();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (game_board[i][j] == 0 && !visited1[i][j])
                    holes.add(bfs(game_board, visited1, i, j, n, 0));

        boolean[][] visited2 = new boolean[n][n];
        List<List<int[]>> pieces = new ArrayList<>();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (table[i][j] == 1 && !visited2[i][j])
                    pieces.add(bfs(table, visited2, i, j, n, 1));

        int H = holes.size();
        int P = pieces.size();

        String[] holeShape = new String[H];
        for (int i = 0; i < H; i++) holeShape[i] = normalize(holes.get(i));

        int[] pieceSize = new int[P];
        List<Set<String>> pieceRotShapes = new ArrayList<>();
        for (int j = 0; j < P; j++) {
            List<int[]> cells = pieces.get(j);
            pieceSize[j] = cells.size();
            Set<String> shapes = new HashSet<>();
            List<int[]> cur = cells;
            for (int r = 0; r < 4; r++) {
                shapes.add(normalize(cur));
                cur = rotate(cur);
            }
            pieceRotShapes.add(shapes);
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            List<Integer> lst = new ArrayList<>();
            for (int j = 0; j < P; j++)
                if (pieceRotShapes.get(j).contains(holeShape[i])) lst.add(j);
            adj.add(lst);
        }

        int[] matchPiece = new int[P];
        Arrays.fill(matchPiece, -1);

        for (int i = 0; i < H; i++) {
            boolean[] visitedPiece = new boolean[P];
            tryKuhn(i, adj, visitedPiece, matchPiece);
        }

        int answer = 0;
        for (int j = 0; j < P; j++)
            if (matchPiece[j] != -1) answer += pieceSize[j];

        return answer;
    }

    private boolean tryKuhn(int hole, List<List<Integer>> adj, boolean[] visitedPiece, int[] matchPiece) {
        for (int piece : adj.get(hole)) {
            if (!visitedPiece[piece]) {
                visitedPiece[piece] = true;
                if (matchPiece[piece] == -1 || tryKuhn(matchPiece[piece], adj, visitedPiece, matchPiece)) {
                    matchPiece[piece] = hole;
                    return true;
                }
            }
        }
        return false;
    }

    private List<int[]> bfs(int[][] grid, boolean[][] visited, int si, int sj, int n, int targetVal) {
        List<int[]> comp = new ArrayList<>();
        Deque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{si, sj});
        visited[si][sj] = true;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            comp.add(cur);
            for (int d = 0; d < 4; d++) {
                int nr = cur[0] + dr[d];
                int nc = cur[1] + dc[d];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n
                        && !visited[nr][nc] && grid[nr][nc] == targetVal) {
                    visited[nr][nc] = true;
                    queue.add(new int[]{nr, nc});
                }
            }
        }
        return comp;
    }

    private String normalize(List<int[]> cells) {
        int minR = Integer.MAX_VALUE, minC = Integer.MAX_VALUE;
        for (int[] c : cells) {
            minR = Math.min(minR, c[0]);
            minC = Math.min(minC, c[1]);
        }
        List<int[]> shifted = new ArrayList<>();
        for (int[] c : cells) shifted.add(new int[]{c[0] - minR, c[1] - minC});
        shifted.sort((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        StringBuilder sb = new StringBuilder();
        for (int[] c : shifted) sb.append(c[0]).append(",").append(c[1]).append(";");
        return sb.toString();
    }

    private List<int[]> rotate(List<int[]> cells) {
        List<int[]> rotated = new ArrayList<>();
        for (int[] c : cells) rotated.add(new int[]{c[1], -c[0]});
        return rotated;
    }
}