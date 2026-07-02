class Solution {
    public int solution(int n) {
        double sqrtValue = Math.sqrt(n);
        return (sqrtValue == (int) sqrtValue) ? 1 : 2;
    }
}