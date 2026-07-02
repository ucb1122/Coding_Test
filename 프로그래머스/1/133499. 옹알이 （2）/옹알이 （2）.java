class Solution {
    public int solution(String[] babbling) {
        String[] available = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (String str : babbling) {
            if (str.contains("ayaaya") || str.contains("yeye") || 
                str.contains("woowoo") || str.contains("mama")) {
                continue;
            }
            
            for (String av : available) {
                str = str.replace(av, " ");
            }
            
            if (str.trim().length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}