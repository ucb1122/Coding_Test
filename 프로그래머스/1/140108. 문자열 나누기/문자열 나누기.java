class Solution {
    public int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);
        int firstCount = 0;
        int otherCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == first) {
                firstCount++;
            } else {
                otherCount++;
            }

            if (firstCount == otherCount) {
                answer++;

                if (i + 1 < s.length()) {
                    first = s.charAt(i + 1);
                    firstCount = 0;
                    otherCount = 0;
                }
            }
        }

        if (firstCount != otherCount) {
            answer++;
        }

        return answer;
    }
}