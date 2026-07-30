class Solution {
    int maxDepth = 0;
    boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return maxDepth;
    }

    private void dfs(int currentK, int[][] dungeons, int count) {
        maxDepth = Math.max(maxDepth, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && currentK >= dungeons[i][0]) {
                visited[i] = true;
                dfs(currentK - dungeons[i][1], dungeons, count + 1);
                visited[i] = false;
            }
        }
    }
}