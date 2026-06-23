class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        long x = (long) sqrt;
                if (x * x == n) {
            return (x + 1) * (x + 1);
        } else {
            return -1;
        }
    }
}