class Solution {
    public int[] solution(int n, int k) {
        int count = 0;
        for (int i = k; i <= n; i += k) {
            count++; 
        }
        int[] answer = new int[count];
        int index = 0;
        for (int i = k; i <= n; i += k) {
            answer[index] = i;
            index++;
        }
        return answer;
    }
}