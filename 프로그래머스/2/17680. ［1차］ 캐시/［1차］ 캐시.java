import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();

        for (String city : cities) {
            String name = city.toLowerCase();

            if (cache.remove(name)) {
                cache.addLast(name);
                answer += 1;
            } else {
                if (cache.size() == cacheSize) {
                    cache.removeFirst();
                }
                cache.addLast(name);
                answer += 5;
            }
        }
        return answer;
    }
}