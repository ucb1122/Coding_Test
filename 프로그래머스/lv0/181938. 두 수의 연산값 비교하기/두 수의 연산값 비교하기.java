class Solution {
    public int solution(int a, int b) {
        int answer = 0; 
        String x = Integer.toString(a);
        String y = Integer.toString(b);
        int z = (2 * a * b);
        
        String sum = x + y;
        answer = Integer.parseInt(sum) > z ? Integer.parseInt(sum) : z;
        return answer;        
    }
}