import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> members = new PriorityQueue<>();
        
        for (int i = 0; i < score.length; i++) {
            int currentScore = score[i];
            
            members.add(currentScore);
            
            if (members.size() > k) {
                members.poll();
            }
            answer[i] = members.peek();
        }
        return answer;
    }
}