class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int w = box[0];
        int l = box[1];
        int h = box[2];
        
        if (n > w || n > l || n > h || n == 0) {
            return 0;
        } else {
           answer = (int) (w /n) * (l/n) * (h/n); 
        }
        return answer;
    }
}