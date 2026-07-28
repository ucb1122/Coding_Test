import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int len = elements.length;

        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < len; j++) {
                int sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += elements[(j + k) % len];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}