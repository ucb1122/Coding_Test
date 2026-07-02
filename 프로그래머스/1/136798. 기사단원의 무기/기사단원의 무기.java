import java.util.HashMap; 

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= number; i++) {
            map.put(i, countFactor(i, limit, power));
            answer += map.get(i);
        } 
        return answer;
    }
    
    public int countFactor(int number, int limit, int power) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0) {
                count++;
                if(count > limit) {
                    count = power;
                    break;
                }    
            }
        }
        return count; 
    }
}