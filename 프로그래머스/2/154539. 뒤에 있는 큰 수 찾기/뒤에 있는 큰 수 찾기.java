import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        int n = numbers.length;
        
        int[] answer = new int[n];
        
        Arrays.fill(answer, -1);

        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            while (top >= 0 && numbers[stack[top]] < numbers[i]) {
                answer[stack[top--]] = numbers[i];
            }
            stack[++top] = i;
        }
        return answer;
    }
}