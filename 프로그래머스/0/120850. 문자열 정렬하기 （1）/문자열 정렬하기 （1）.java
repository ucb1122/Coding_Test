import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String numStr = my_string.replaceAll("[a-z]", "");

        int[] answer = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            answer[i] = Character.getNumericValue(ch);
        } 
        Arrays.sort(answer);

        return answer;
    }
}