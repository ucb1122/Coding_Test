import java.util.Arrays;

class Solution {
    public int solution(int[] array1, int height) {
        int count = 0;
        for (int n : array1) {
         if (height < n) {
             count++;
            }
        }
        return count; 
    }
}