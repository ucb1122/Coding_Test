class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int [] intArr = new int[included.length];
        int temp = a; 

        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = temp;
            temp += d;
        }
        
        for(int i = 0; i < intArr.length; i++) {
            if (included[i] == true) {
                answer += intArr[i];
            }   
        }
        return answer;
    }
}