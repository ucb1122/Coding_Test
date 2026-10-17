class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder game = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        int need = (t - 1) * m + p;

        for (int num = 0; game.length() < need; num++) {
            game.append(Integer.toString(num, n).toUpperCase());
        }

        for (int i = 0; i < t; i++) {
            answer.append(game.charAt(p - 1 + i * m));
        }
        return answer.toString();
    }
}