class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money >= 5500 ? (int) (money/5500) : 0;
        answer[1] = money%5500;
        return answer; 
    }
}