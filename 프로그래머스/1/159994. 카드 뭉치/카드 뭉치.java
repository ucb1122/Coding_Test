import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        
        for (String card : cards1) {
            q1.add(card);
        }
        
        for (String card : cards2) {
            q2.add(card);
        }
        
        for (String target : goal) {
            if (!q1.isEmpty() && q1.peek().equals(target)) {
                q1.poll();
            } 
            else if (!q2.isEmpty() && q2.peek().equals(target)) {
                q2.poll();
            } 
            else {
                return "No";
            }
        }
        return "Yes";
    }
}