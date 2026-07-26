import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> usedWords = new HashSet<>();
        usedWords.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String prevWord = words[i - 1];
            String currWord = words[i];

            if (prevWord.charAt(prevWord.length() - 1) != currWord.charAt(0) || 
                usedWords.contains(currWord)) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }
            usedWords.add(currWord);
        }
        return new int[]{0, 0};
    }
}