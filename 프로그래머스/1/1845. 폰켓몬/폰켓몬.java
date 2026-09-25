import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int answer = 0;
        
        for (int n : nums) {
            set.add(n);
        }
        
        int c = (nums.length) / 2;
        int s = set.size(); 

        return (c > s)? s : c;
    }
}