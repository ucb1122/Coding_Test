import java.util.*;

class Solution {
    public String[] solution(String[][] tickets) {
        
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        
        for (String[] t : tickets) {
            graph.computeIfAbsent(t[0], k -> new PriorityQueue<>()).add(t[1]);
        }

        LinkedList<String> route = new LinkedList<>();
        
        Deque<String> stack = new ArrayDeque<>();
        
        stack.push("ICN");

        while (!stack.isEmpty()) {
            
            String cur = stack.peek();
            
            PriorityQueue<String> pq = graph.get(cur);
            
            if (pq != null && !pq.isEmpty()) {
                stack.push(pq.poll());
            } else {
                route.addFirst(stack.pop());
            }
        }
        return route.toArray(new String[0]);
    }
}