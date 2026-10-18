import java.util.*;

class Solution {

    char[] alphabet = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G',
        'H', 'I', 'J', 'K', 'L', 'M', 'N',
        'O', 'P', 'Q', 'R', 'S', 'T', 'U',
        'V', 'W', 'X', 'Y', 'Z'
    };

    public int solution(String name) {
        int answer = 0;
        int n = name.length();

        for (int i = 0; i < n; i++) {
            char target = name.charAt(i);

            int index = findAlphabetIndex(target);

            int up = index;

            int down = alphabet.length - index;

            answer += Math.min(up, down);
        }

        int move = n - 1;

        for (int i = 0; i < n; i++) {
            int next = i + 1;

            while (next < n && name.charAt(next) == 'A') {
                next++;
            }

            int rightFirst = i * 2 + (n - next);

            int leftFirst = (n - next) * 2 + i;

            move = Math.min(move, rightFirst);
            move = Math.min(move, leftFirst);
        }

        return answer + move;
    }

    private int findAlphabetIndex(char target) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == target) {
                return i;
            }
        }
        return 0;
    }
}