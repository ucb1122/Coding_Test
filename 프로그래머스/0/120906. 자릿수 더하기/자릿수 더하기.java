class Solution {
    public int solution(int n) {
        int answer = 0;
        String text = String.valueOf(n);
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            answer += Integer.parseInt(ch + "");
        }
        return answer;
    }
}