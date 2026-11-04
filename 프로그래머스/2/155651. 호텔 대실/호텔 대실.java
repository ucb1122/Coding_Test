class Solution {
    public int solution(String[][] book_time) {
        int[] diff = new int[1500];

        for (String[] time : book_time) {
            int start = toMinutes(time[0]);
            int end = toMinutes(time[1]) + 10;

            diff[start]++;
            diff[end]--;
        }

        int answer = 0;
        int current = 0;
        for (int i = 0; i < diff.length; i++) {
            current += diff[i];
            answer = Math.max(answer, current);
        }

        return answer;
    }

    private int toMinutes(String t) {
        String[] parts = t.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}