class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        int my_string_n = my_string.length();
        int overwrite_string_n = overwrite_string.length();
        String answer = "";
        
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string_n, my_string_n);
        
        return answer; 
    }
}