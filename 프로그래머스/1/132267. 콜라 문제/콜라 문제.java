class Solution {
    public int solution(int a, int b, int n) {
        int requiredCola = a;
        int freeCola = b;
        int countCola = n;
        int totalGetCola = 0;
        
        if (countCola < 2) {
            return 0;
        } 
            
        while (countCola >= requiredCola) {
            int newCola = (countCola / requiredCola) * freeCola;
            totalGetCola += newCola;
            int restCola = countCola % requiredCola;
            countCola = newCola + restCola;
        }
        return totalGetCola;
    }
}