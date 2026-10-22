class Solution {
    public int solution(int[][] routes) {

        for (int i = 1; i < routes.length; i++) {
            int[] key = routes[i];
            int j = i - 1;
            while (j >= 0 && routes[j][1] > key[1]) {
                routes[j + 1] = routes[j];
                j--;
            }
            routes[j + 1] = key;
        }

        int answer = 1;
        int camera = routes[0][1];

        for (int i = 1; i < routes.length; i++) {
            if (routes[i][0] > camera) {
                answer++;
                camera = routes[i][1];
            }
        }
        return answer;
    }
}