class Solution {
    public int solution(int n, int k) {
        int answer = 0;

        String converted = Integer.toString(n, k);
        String[] parts = converted.split("0");

        for (String part : parts) {
            if (part.isEmpty()) {
                continue;
            }
            long num = Long.parseLong(part);
            if (isPrime(num)) { 
                answer++;
            }
        }

        return answer;
    }

    private boolean isPrime(long num) {
        if (num < 2) return false;
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}