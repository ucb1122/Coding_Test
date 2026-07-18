import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, List<String>> reporter = new HashMap<>(); 
        Map<String, Integer> reported = new HashMap<>();  
        
        for (String ex : id_list) {
            reporter.put(ex, new ArrayList<>());
            reported.put(ex, 0);
        }
        
        for (int i = 0; i < report.length; i++) {
            String[] str = report[i].split(" ");
            String s1 = str[0]; 
            String s2 = str[1];
            
            if (!reporter.get(s1).contains(s2)) { 
                reporter.get(s1).add(s2);
                reported.put(s2, reported.get(s2) + 1);    
            }
        }
        
        int[] answer = new int[id_list.length];
        
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            List<String> myReportList = reporter.get(user);
            
            int mailCount = 0;
            for (String target : myReportList) {
                if (reported.get(target) >= k) {
                    mailCount++;
                }
            }
            answer[i] = mailCount;
        }
        return answer;
    }
}