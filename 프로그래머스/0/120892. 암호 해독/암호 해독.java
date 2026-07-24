class Solution {
    public String solution(String cipher, int code) {
        StringBuilder str = new StringBuilder(); 
        
        for (int i = code - 1; i < cipher.length(); i+= code) {
            char ch = cipher.charAt(i);
            str.append(ch);
        }
        return str.toString();
    }
}