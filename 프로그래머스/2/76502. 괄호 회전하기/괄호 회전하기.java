import java.util.Stack;

class Solution {
    public int solution(String s) {
        if (s.length() % 2 != 0) return 0;
        
        int answer = 0;

        for (int x = 0; x < s.length(); x++) {
            String rotated = s.substring(x) + s.substring(0, x);
            if (isValid(rotated)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.peek();
                if ((ch == ')' && top == '(') ||
                    (ch == ']' && top == '[') ||
                    (ch == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}