import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        Map<String, Integer> m1 = toMultiset(str1);
        Map<String, Integer> m2 = toMultiset(str2);

        int inter = 0, union = 0;
        Set<String> keys = new HashSet<>(m1.keySet());
        keys.addAll(m2.keySet());

        for (String k : keys) {
            int a = m1.getOrDefault(k, 0);
            int b = m2.getOrDefault(k, 0);
            inter += Math.min(a, b);
            union += Math.max(a, b);
        }

        if (union == 0) {
            return 65536;
        }
        return (int) ((double) inter / union * 65536);
    }

    private Map<String, Integer> toMultiset(String s) {
        Map<String, Integer> map = new HashMap<>();
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            if (c1 >= 'a' && c1 <= 'z' && c2 >= 'a' && c2 <= 'z') {
                map.merge("" + c1 + c2, 1, Integer::sum);
            }
        }
        return map;
    }
}