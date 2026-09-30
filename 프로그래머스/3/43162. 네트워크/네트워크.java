class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] isVisited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if(!isVisited[i]) {
                dfs(i, n, computers, isVisited);
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(int current, int n, int[][] computers, boolean[] isVisited) {
        isVisited[current] = true;
        
        for (int i = 0; i < n; i++) {
            if (computers[current][i] == 1 && !isVisited[i]) {
                dfs(i, n, computers, isVisited);
            }
        }
    }
}