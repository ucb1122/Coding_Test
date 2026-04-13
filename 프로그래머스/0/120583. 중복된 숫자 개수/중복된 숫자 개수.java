class Solution {
    public int solution(int[] array, int n) {
        int count = 0;
        for (int i : array) {
            if (n == i) {
                count++;
            }
        }
        return count; 
    }
}