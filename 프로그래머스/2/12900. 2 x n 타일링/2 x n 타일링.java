class Solution {
    public int solution(int n) {
        int MOD = 1_000_000_007;
        
        if (n <= 2) return n;
        
        int prev = 1;   // dp[1]
        int curr = 2;  
        
        for (int i = 3; i <= n; i++) {
            int next = (prev + curr) % MOD;
            prev = curr;
            curr = next;
        }
        
        return curr;
    }
}