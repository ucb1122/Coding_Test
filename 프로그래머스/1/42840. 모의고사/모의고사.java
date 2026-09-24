import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int l = answers.length;
        
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int fCount = 0;
        int sCount = 0;
        int tCount = 0;
        
        for (int i = 0; i < l; i++) {
            if (answers[i] == first[i % first.length]) {
                fCount++;    
            }
            if (answers[i] == second[i % second.length]) {
                sCount++;    
            }
            if (answers[i] == third[i % third.length]) {
                tCount++;    
            }
        }
        
        int maxScore = Math.max(fCount, Math.max(sCount, tCount));
        ArrayList<Integer> answer = new ArrayList<>();
        
        if (maxScore == fCount) answer.add(1);
        if (maxScore == sCount) answer.add(2);
        if (maxScore == tCount) answer.add(3);
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
            }
        return result;
    }
}