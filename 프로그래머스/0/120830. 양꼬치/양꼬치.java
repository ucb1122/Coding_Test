class Solution {
    public int solution(int n, int k) {
        return n < 10 ? n*12000 + k*2000 : n*12000 + k*2000 - (n/10) * 2000;
        }
}  
