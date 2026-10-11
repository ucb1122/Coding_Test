import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            boolean hasHigher = false;
            for (int[] p : queue) {
                if (p[1] > cur[1]) {
                    hasHigher = true;
                    break;
                }
            }

            if (hasHigher) {
                queue.add(cur);          
            } else {
                answer++;                
                if (cur[0] == location) {
                    return answer;       
                }
            }
        }
        return answer;
    }
}