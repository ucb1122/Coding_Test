class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int len = phone_number.length(); 
        
        for (int i = 0; i < len - 4; i++) {
            answer.append("*");
        }
        
        answer.append(phone_number.substring(len - 4));
        return answer.toString();
    }
}