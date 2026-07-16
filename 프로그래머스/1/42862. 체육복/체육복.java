import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(i + 1, 1);
        }
        
        for (int lostNums : lost) {
            map.put(lostNums, map.get(lostNums) - 1);
        }
        
        for (int reserveNums : reserve ) {
            map.put(reserveNums, map.get(reserveNums) + 1);
        }
        
        for (int i = 1; i <= n; i++) {
            if (map.get(i) == 2) {
                if (i - 1 >= 1 && map.get(i - 1) == 0) {
                    map.put(i - 1, 1);
                    map.put(i, 1);    
                } 
                else if (i + 1 <= n && map.get(i + 1) == 0) {
                    map.put(i + 1, 1); 
                    map.put(i, 1);    
                }
            }
        }
        
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (map.get(i) >= 1) {
                answer++;
            }
        }
        
        return answer;
    }
}