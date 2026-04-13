import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        
        while (!queue.isEmpty()) {
            int num = queue.poll();
            
            if (num > r) continue;
            if (num >= l) result.add(num);
            
            queue.add(num * 10);
            queue.add(num * 10 + 5);
        }
        
        if (result.isEmpty()) return new int[]{-1};
        
        Collections.sort(result);
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}