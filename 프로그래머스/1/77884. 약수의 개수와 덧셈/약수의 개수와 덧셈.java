class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        if (left > right) {
            int temp = left;
            left = right;
            right = temp;
        }
        
        for (int i = left; i <= right; i ++) {
            int count = 0; 
            for (int j = 1; j <= i; j++) {
                if (i%j == 0) {
                    count ++;
                }
            }
            if(count%2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}