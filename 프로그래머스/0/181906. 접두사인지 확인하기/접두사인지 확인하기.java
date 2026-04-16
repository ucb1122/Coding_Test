class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int length = is_prefix.length() <= my_string.length() ? is_prefix.length() : 0; 
        for (int i = 0; i < length; i++) {
            if (my_string.charAt(i) != is_prefix.charAt(i)) {
                answer = 0;
                break;
            }
            answer = 1;
        }
        return answer;
    }
}