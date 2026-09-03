class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, n, computers, visited);
                answer++;
            }
        }
        return answer;
    }

    private void dfs(int current, int n, int[][] computers, boolean[] visited) {
        visited[current] = true;

        for (int j = 0; j < n; j++) {
            if (computers[current][j] == 1 && !visited[j]) {
                dfs(j, n, computers, visited); 
            }
        }
    }
}