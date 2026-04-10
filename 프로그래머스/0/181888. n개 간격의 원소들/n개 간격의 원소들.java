import java.util.Arrays; 
    
class Solution {
    public int[] solution(int[] num_list, int n) {
        int temp = n;
        String s = "";
        int count = 0; 
        
        for (int c : num_list) {
            if (n%temp == 0) {
                s += c;
                count ++;
            }
            n += 1;
        }
        
        int[] answer = new int[count];
        for(int i = 0; i < count; i++) {
            answer[i] = s.charAt(i) - '0';
        }
        return answer;
    }
}