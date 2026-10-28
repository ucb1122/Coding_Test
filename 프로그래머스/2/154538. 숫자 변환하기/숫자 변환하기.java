import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        if (x == y) return 0;

        int[] dist = new int[y + 1];
        Arrays.fill(dist, -1);
        dist[x] = 0;

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(x);

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            int[] nexts = {cur + n, cur * 2, cur * 3};

            for (int next : nexts) {
                if (next > y || dist[next] != -1) continue;
                dist[next] = dist[cur] + 1;
                if (next == y) return dist[next];
                queue.add(next);
            }
        }
        return -1;
    }
}