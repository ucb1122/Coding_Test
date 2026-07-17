import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<String, Integer> map = new HashMap<>();
        
        map.put("R", 0); 
        map.put("T", 0);
        map.put("C", 0); 
        map.put("F", 0);
        map.put("J", 0); 
        map.put("M", 0);
        map.put("A", 0); 
        map.put("N", 0);
        
        for (int i = 0; i < survey.length; i++) {
            int option = choices[i];
            
            String first = survey[i].charAt(0) + "";
            String second = survey[i].charAt(1) + "";
            
            switch (option) {
                case 1 :
                    map.put(first, map.get(first) + 3); break;
                case 2 :
                    map.put(first, map.get(first) + 2); break;
                case 3 :
                    map.put(first, map.get(first) + 1); break;
                case 4 :
                    break;
                case 5 :
                    map.put(second, map.get(second) + 1); break;
                case 6 :
                    map.put(second, map.get(second) + 2); break;
                case 7 :
                    map.put(second, map.get(second) + 3); break;
            }
        }
        
        String answer = "";

        if (map.get("R") >= map.get("T")) { answer += "R"; } 
        else { answer += "T"; }
        
        if (map.get("C") >= map.get("F")) { answer += "C"; } 
        else { answer += "F"; } 
                
        if (map.get("J") >= map.get("M")) { answer += "J"; }
        else { answer += "M"; }
           
        if (map.get("A") >= map.get("N")) { answer += "A"; } 
        else { answer += "N"; } 
        
        return answer;
    }
}