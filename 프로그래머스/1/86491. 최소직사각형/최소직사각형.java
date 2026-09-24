import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int n = sizes.length;
        
        int max[] = new int[n];
        int min[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            max[i] = Math.max(sizes[i][0], sizes[i][1]);
            min[i] = Math.min(sizes[i][0], sizes[i][1]);
        }
        
        Arrays.sort(max);
        Arrays.sort(min);
        
        return max[n-1] * min[n-1];
    }
}