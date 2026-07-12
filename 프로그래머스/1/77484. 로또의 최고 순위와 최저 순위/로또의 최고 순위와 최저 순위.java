import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winSet = new HashSet<>();
        for (int num : win_nums) {
            winSet.add(num);
        }
        
        int best = 0;
        int worst = 0;
        
        int currentBest = 0;
        int zeroCount = 0;
        
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
            } else if (winSet.contains(lottos[i])) {
                currentBest++; 
            } else {
                continue; 
            }
        }
        
        best = currentBest + zeroCount;
        worst = currentBest;
        
        int[] answer = {best, worst};
        
        for (int i = 0; i < 2; i++) {
            if (answer[i] == 6) {
                answer[i] = 1;     
            } else if (answer[i] == 5) {
                answer[i] = 2;
            } else if (answer[i] == 4) {
                answer[i] = 3;
            } else if (answer[i] == 3) {
                answer[i] = 4;
            } else if (answer[i] == 2) {
                answer[i] = 5;
            } else {
                answer[i] = 6;
            }
        }
        return answer;
    }
}