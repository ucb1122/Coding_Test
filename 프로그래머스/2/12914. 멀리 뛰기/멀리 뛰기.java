class Solution {
    public long solution(int n) {
        if (n == 1) {
            return 1;
        }
        
        long[] lo = new long[n + 1];
        
        lo[1] = 1;
        lo[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            lo[i] = (lo[i - 1] + lo[i - 2]) % 1234567;
        }
        
        return lo[n];
    }
}