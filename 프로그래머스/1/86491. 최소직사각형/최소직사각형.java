import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int num = sizes.length; 
        
        int[] maxW = new int[num];
        int[] maxH = new int[num];
        
        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0]; // 가로
            int h = sizes[i][1]; // 세로
            
            if ( w > h ) {
                maxW[i] = w;
                maxH[i] = h;
            } else {
                maxW[i] = h;
                maxH[i] = w;
            }
        } 
        
        Arrays.sort(maxW);
        Arrays.sort(maxH);
        
        answer =  maxW[maxW.length - 1] * maxH[maxH.length - 1];
        return answer;
    }
}