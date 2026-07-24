class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        return str.contains(k + "")? str.indexOf(k + "" ) + 1 : -1; 
    }
}