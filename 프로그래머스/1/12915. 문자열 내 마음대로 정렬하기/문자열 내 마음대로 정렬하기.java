import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] str = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            char cr = strings[i].charAt(n);
            str[i] = cr + strings[i];
        }
        Arrays.sort(str);
        
        String[] answer = new String[strings.length];
        for (int i = 0; i < str.length; i++) {
            answer[i] = str[i].substring(1);
        }
        return answer;
    }
}