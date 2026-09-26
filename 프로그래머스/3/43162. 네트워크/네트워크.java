class Solution {
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        boolean[] isVisited = new boolean[n];  
        
        for (int i = 0; i < n; i++) {
            if(!isVisited[i]) {
                dfs(i, isVisited, computers, n);
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(int current, boolean[] isVisited, int[][] computers, int n) {
        isVisited[current] = true;
        
        for(int i = 0; i < n; i ++) {
            if (current != i && computers[current][i] == 1 && !isVisited[i]) {
                dfs(i, isVisited, computers, n);
            }
        }
    }
}