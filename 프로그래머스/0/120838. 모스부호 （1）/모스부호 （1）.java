import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String, Character> map = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            map.put(morse[i], (char)(97 + i));
        }
        
        StringBuilder sb = new StringBuilder();
        String[] str = letter.split(" ");
        for (String s: str) {
            sb.append(map.get(s));
        }
        String answer = sb.toString();
        return answer;
    }
}