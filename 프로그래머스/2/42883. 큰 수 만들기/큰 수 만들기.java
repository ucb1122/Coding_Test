import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Deque<Character> dq = new ArrayDeque<>();

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);

            while (k > 0 && !dq.isEmpty() && dq.peekLast() < c) {
                dq.pollLast();
                k--;
            }
            dq.offerLast(c);
        }

        while (k > 0) {
            dq.pollLast();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : dq) {
            sb.append(c);
        }
        return sb.toString();
    }
}