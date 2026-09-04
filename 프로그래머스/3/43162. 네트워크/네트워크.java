class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (computers[i][i] == 0) continue;

            answer++;

            boolean changed = true;
            while (changed) {
                changed = false;
                for (int j = 0; j < n; j++) {
                    if (computers[j][j] == 1) {
                        for (int k = 0; k < n; k++) {
                            if (computers[j][k] == 1 && (computers[k][k] == 0 || j == i)) {
                                computers[j][j] = 0;
                                computers[k][k] = 0;
                                changed = true;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}