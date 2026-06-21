import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String text = String.valueOf(n);
        
        char[] chars = text.toCharArray();
        
        Arrays.sort(chars);
        
        String answerStr = "";
        
        for (int i = chars.length - 1; i >= 0; i--) {
            answerStr += chars[i];
        }        
        
        return Long.parseLong(answerStr);
    }
}