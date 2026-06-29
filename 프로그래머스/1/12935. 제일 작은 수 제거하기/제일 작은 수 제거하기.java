import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        
        int[] copy = arr.clone();
        Arrays.sort(copy);
        int minNum = copy[0];
        
        int[] answer = new int[arr.length - 1];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minNum) {
                continue; 
            }
            answer[index++] = arr[i];
        }
        return answer;
    }
}