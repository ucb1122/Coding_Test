class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        String[] num = {"4", "1", "2"};

        while (n > 0) {
            int r = n % 3;
            sb.append(num[r]);
            n = (n - 1) / 3;
        }

        return sb.reverse().toString();
    }
}