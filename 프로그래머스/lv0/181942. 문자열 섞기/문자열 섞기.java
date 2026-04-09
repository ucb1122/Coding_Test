import java.util.Arrays;

class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int n = str1.length() + str2.length();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        
        for (int i = 0; i < str1.length(); i ++) {
            answer += ch1[i];
            answer += ch2[i];
        }
        return answer;
    }
}