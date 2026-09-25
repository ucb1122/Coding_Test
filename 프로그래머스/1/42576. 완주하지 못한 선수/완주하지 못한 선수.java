import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";

        for (int i = 0; i < participant.length; i++) {
            if (map.containsKey(participant[i])) {
                map.put(participant[i], map.get(participant[i]) - 1);
            } else {
            map.put(participant[i], 0);
            }
        }
        
        for (String name : completion) {
            map.put(name, map.get(name) + 1);
        }
        
        for (String name : participant) {
            if (map.get(name) == 0) {
                answer += name;
                break;
            }
        } 
        return answer;
    }
}