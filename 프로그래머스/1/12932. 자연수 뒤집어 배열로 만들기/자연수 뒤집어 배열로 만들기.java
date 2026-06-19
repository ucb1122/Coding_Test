class Solution {
    public int[] solution(long n) {
        String text = String.valueOf(n);
        int[] answer = new int[text.length()];
        int index = 0;
        
        for (int i = text.length() - 1; i >= 0; i--) {
            answer[index] = Character.getNumericValue(text.charAt(i));
            index++;
        }
        return answer; 
    }
}