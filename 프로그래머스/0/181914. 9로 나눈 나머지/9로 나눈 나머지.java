class Solution {
    public int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            answer += (ch - '0');
            
        }
        return answer%9; 
    }
}