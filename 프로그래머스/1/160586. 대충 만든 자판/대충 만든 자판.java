import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> minPressMap = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);
                int count = i + 1;
                minPressMap.put(ch, Math.min(minPressMap.getOrDefault(ch, Integer.MAX_VALUE), count));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalPress = 0;
            boolean isPossible = true;

            for (int j = 0; j < target.length(); j++) {
                char ch = target.charAt(j);
                
                if (minPressMap.containsKey(ch)) {
                    totalPress += minPressMap.get(ch);
                } else {
                    isPossible = false;
                    break;
                }
            }

            answer[i] = isPossible ? totalPress : -1;
        }

        return answer;
    }
}