class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        long[] cnt = new long[1001];
        
        for (int w : weights) {
            cnt[w]++;
        }
        
        for (int w = 100; w <= 1000; w++) {
            if (cnt[w] == 0) continue;
            
            answer += cnt[w] * (cnt[w] - 1) / 2;
            
            if (w * 2 <= 1000) {
                answer += cnt[w] * cnt[w * 2];
            }
            
            if ((w * 3) % 2 == 0 && w * 3 / 2 <= 1000) {
                answer += cnt[w] * cnt[w * 3 / 2];
            }
            
            if ((w * 4) % 3 == 0 && w * 4 / 3 <= 1000) {
                answer += cnt[w] * cnt[w * 4 / 3];
            }
        }
        return answer;
    }
}