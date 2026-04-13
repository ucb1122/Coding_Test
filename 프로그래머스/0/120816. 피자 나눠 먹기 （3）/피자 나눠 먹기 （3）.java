class Solution {
    public int solution(int slice, int n) {
        return (slice == n || slice < n) ? (int) Math.ceil((double)n / slice) : (int) Math .ceil((double)n/slice);
    }
}