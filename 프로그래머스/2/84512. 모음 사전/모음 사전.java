import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String word) {
        int answer = 0;
        
        int[] weights = {781, 156, 31, 6, 1};
        
        Map<Character, Integer> vowelIndex = new HashMap<>();
        vowelIndex.put('A', 0);
        vowelIndex.put('E', 1);
        vowelIndex.put('I', 2);
        vowelIndex.put('O', 3);
        vowelIndex.put('U', 4);

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            answer += vowelIndex.get(c) * weights[i] + 1;
        }
        return answer;
    }
}