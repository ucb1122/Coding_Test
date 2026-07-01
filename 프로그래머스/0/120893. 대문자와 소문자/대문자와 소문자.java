class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch + 32));
            } else {
                sb.append((char)(ch - 32));
            }
        }
        return sb.toString();
    }
}