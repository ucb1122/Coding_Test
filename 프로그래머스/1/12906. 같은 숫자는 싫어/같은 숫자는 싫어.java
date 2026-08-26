import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>(); 
        
        for (int n : arr) {
            if (stack.isEmpty()) {
                stack.push(n);
            } else {
                if (stack.peek() == n) {
                    continue;
                } else {
                    stack.push(n);
                }
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
            }
        
        return answer;
    }
}