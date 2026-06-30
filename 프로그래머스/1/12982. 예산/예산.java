import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0; 
        for (int i = 0; i < d.length; i++) {
            if (budget < d[i]) {
                break; 
            }
            count++;
            budget -= d[i];
        }
        return count;
    }
}