class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String text = String.valueOf(x); 
        for (int i = 0; i < text.length(); i++) {
            sum += text.charAt(i) - '0';
            }
        return (x%sum == 0)? true : false ; 
    }
}