class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = arrayGcd(arrayA);
        int gcdB = arrayGcd(arrayB);

        int answer = 0;
        if (!divisibleByAny(arrayB, gcdA)) {
            answer = Math.max(answer, gcdA);
        }
        if (!divisibleByAny(arrayA, gcdB)) {
            answer = Math.max(answer, gcdB);
        }
        return answer;
    }

    private int arrayGcd(int[] arr) {
        int g = arr[0];
        for (int i = 1; i < arr.length; i++) {
            g = gcd(g, arr[i]);
        }
        return g;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    private boolean divisibleByAny(int[] arr, int d) {
        for (int x : arr) {
            if (x % d == 0) {
                return true;
            }
        }
        return false;
    }
}