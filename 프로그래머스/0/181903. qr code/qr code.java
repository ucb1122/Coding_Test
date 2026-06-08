class Solution {
    public String solution(int q, int r, String code) {     
        String answer = "";    
        if (q <= 1 ) {
            return code;
        } else {
            for (int i = r; i < code.length(); i = i + q) {
                char c = code.charAt(i);
                answer +=  c;
            }
            return answer; 
        }   
    }
}