import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] parts = s.substring(2, s.length() - 2).split("\\},\\{");

        Arrays.sort(parts, Comparator.comparingInt(String::length));

        Set<Integer> set = new LinkedHashSet<>();
        for (String part : parts) {
            for (String num : part.split(",")) {
                set.add(Integer.parseInt(num));
            }
        }

        int[] answer = new int[set.size()];
        int idx = 0;
        for (int n : set) {
            answer[idx++] = n;
        }
        return answer;
    }
}