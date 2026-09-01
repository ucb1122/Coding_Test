class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[][] result1 = new int[n][n];
        int[][] result2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            int num1 = arr1[i];
            int num2 = arr2[i];

            for (int j = n - 1; j >= 0; j--) {
                result1[i][j] = num1 % 2;
                num1 = num1 / 2;

                result2[i][j] = num2 % 2;
                num2 = num2 / 2;
            }
        }
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String answerStr = "";
            for (int j = 0; j < n; j++) {
                if (result1[i][j] == 1 || result2[i][j] == 1) {
                    answerStr += "#";
                } else {
                    answerStr += " ";
                }
            }
            answer[i] = answerStr;
        }
        return answer;
    }
}