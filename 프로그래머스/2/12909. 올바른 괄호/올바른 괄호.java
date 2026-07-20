import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();  
        boolean answer = false; 
        
        if(stack.isEmpty() && s.charAt(0) == ')') {
            return false;
        } else {
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
            
                stack.push(ch);
            
                if (stack.peek() == ')') {
                    stack.pop();
                    if (stack.isEmpty() == true) {
                        return false; 
                    }
                    stack.pop();
                }
            }
        
            if (stack.size() == 0) {
                answer = true; 
            }
        }       
        
        return answer;
    }
}