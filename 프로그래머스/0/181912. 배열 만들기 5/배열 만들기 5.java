import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> resultList = new ArrayList<>();
        
        for (String str : intStrs) {
            String sub = str.substring(s, s + l);
            int val = Integer.parseInt(sub);
            if (val > k) {
                resultList.add(val);
            }
        }
        
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        return answer;
    }
}