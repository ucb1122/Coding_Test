class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ' ') {
                answer.append(ch);
            } else if (Character.isUpperCase(ch)) {
                char moved = (char) ((ch - 'A' + n) % 26 + 'A');
                answer.append(moved);
            } else if (Character.isLowerCase(ch)) {
                char moved = (char) ((ch - 'a' + n) % 26 + 'a');
                answer.append(moved);
            }
        }
        return answer.toString();
    }
}