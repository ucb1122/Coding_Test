import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        List<Integer> counts = new ArrayList<>(map.values());
        
        counts.sort(Collections.reverseOrder());
        
        int answer = 0;
        
        for (int count : counts) {
            k -= count;
            answer++;
            
            if (k <= 0) {
                break;
            }
        }
        
        return answer;
    }
}