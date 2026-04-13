class Solution {
    public int solution(int n) {
        if (n == 7 || n < 7) {return 1;} 
        else {return (int) Math.ceil((double)n/7);}
    }
}