import java.util.*;

class Solution {
    public int solution(String dartResult) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            if (ch >= '0' && ch <= '9') {
                if (ch == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    stack.push(10);
                    i++;
                } else {
                    stack.push(Character.getNumericValue(ch));
                }
            } 
            else if (ch == 'S' || ch == 'D' || ch == 'T') {
                int score = stack.pop();
                
                if (ch == 'D') {
                    score = (int) Math.pow(score, 2); 
                } else if (ch == 'T') {
                    score = (int) Math.pow(score, 3);
                }
                
                stack.push(score);
            } 

            else if (ch == '*' || ch == '#') {
                if (ch == '*') {
                    int cur = stack.pop();
                    
                    if (!stack.isEmpty()) {
                        int prev = stack.pop();
                        stack.push(prev * 2);
                    }
                    
                    stack.push(cur * 2);
                } else if (ch == '#') {
                    int cur = stack.pop();
                    stack.push(cur * -1);
                }
            }
        }

        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        return answer;
    }
}