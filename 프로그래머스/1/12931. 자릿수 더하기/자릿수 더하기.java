import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String text = String.valueOf(n);
    
        for (int i = 0; i < text.length(); i++) {
            answer += Character.getNumericValue(text.charAt(i));
        }
        return answer;
    }
}