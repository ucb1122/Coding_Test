class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
        int[] answer = {0, n - 1};
        int minLen = Integer.MAX_VALUE;

        int left = 0;
        long sum = 0;

        for (int right = 0; right < n; right++) {
            sum += sequence[right];

            while (sum > k) {
                sum -= sequence[left++];
            }

            if (sum == k) {
                int len = right - left + 1;
                if (len < minLen) {
                    minLen = len;
                    answer[0] = left;
                    answer[1] = right;
                }
            }
        }
        return answer;
    }
}