class Solution {
    public int solution(int a, int b) {
        String x = Integer.toString(a);
        String y = Integer.toString(b);
        
        String n = x + y;
        String m = y + x;
        
        int answer = Math.max(Integer.parseInt(n), Integer.parseInt(m));
        return answer;
    }
}