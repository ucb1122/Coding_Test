import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < wires.length; i++) {

            List<List<Integer>> graph = new ArrayList<>();
            for (int j = 0; j <= n; j++) {
                graph.add(new ArrayList<>());
            }

            for (int j = 0; j < wires.length; j++) {
                if (j == i) continue;

                int v1 = wires[j][0];
                int v2 = wires[j][1];
                graph.get(v1).add(v2);
                graph.get(v2).add(v1);
            }

            int startNode = wires[i][0];
            int groupSize = countGroup(startNode, graph, n);

            int otherGroupSize = n - groupSize;
            int diff = Math.abs(groupSize - otherGroupSize);

            answer = Math.min(answer, diff);
        }
        return answer;
    }

    private int countGroup(int startNode, List<List<Integer>> graph, int n) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(startNode);
        visited[startNode] = true;
        int count = 1;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : graph.get(current)) {
                if (!visited[next]) {
                    visited[next] = true;
                    count++;
                    queue.offer(next);
                }
            }
        }
        return count;
    }
}