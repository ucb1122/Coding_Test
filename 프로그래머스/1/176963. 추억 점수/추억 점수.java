import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> scoreMap = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }
        
        for (int i = 0; i < photo.length; i++) {
            int currentScore = 0;
            
            for (String person : photo[i]) {
                currentScore += scoreMap.getOrDefault(person, 0);
            }
            answer[i] = currentScore;
        }
        return answer;
    }
}