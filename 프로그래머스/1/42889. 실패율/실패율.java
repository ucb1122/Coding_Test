import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Integer> stageUsers = new HashMap<>();
        for (int stage : stages) {
            stageUsers.put(stage, stageUsers.getOrDefault(stage, 0) + 1);
        }
        
        HashMap<Integer, Double> failureRates = new HashMap<>();
        int totalUsers = stages.length;
        
        for (int i = 1; i <= N; i++) {
            if (totalUsers == 0) {
                failureRates.put(i, 0.0);
            } else {
                int currentUsers = stageUsers.getOrDefault(i, 0);
                double rate = (double) currentUsers / totalUsers;
                
                failureRates.put(i, rate);
                totalUsers -= currentUsers;
            }
        }
        
        List<Integer> stageList = new ArrayList<>(failureRates.keySet());
        
        Collections.sort(stageList, (o1, o2) -> {
            if (failureRates.get(o1).equals(failureRates.get(o2))) {
                return Integer.compare(o1, o2);
            }
            return Double.compare(failureRates.get(o2), failureRates.get(o1));
        });
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i);
        }
        
        return answer;
    }
}