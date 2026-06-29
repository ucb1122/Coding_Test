class Solution {
    public String solution(int n) {
        String text = "수박";
        return (n % 2 == 0) ? text.repeat(n / 2) : text.repeat(n / 2) + "수";    
    }
}