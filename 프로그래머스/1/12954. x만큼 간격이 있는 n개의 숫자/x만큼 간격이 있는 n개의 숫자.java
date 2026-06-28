class Solution {
    public long[] solution(int x, int n) {
        long startNum = (long) x; 
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = startNum;
            startNum += x;    
        }
        return answer;
    }
}