import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        Arrays.sort(wallet); //지갑 정렬
        Arrays.sort(bill);   //지폐 정렬
        
        while (bill[0] > wallet[0] || bill[1] > wallet[1]) { //작은 지폐가 더 크거나, 큰 지폐가 더 크다면 계속 
            if (bill[0] > bill[1]) { // 만약 지폐의 작은 부분이 더 크다면, 
                bill[0]= bill[0] / 2;
                Arrays.sort(bill);
                answer++;
            } else if (bill[0] < bill[1]) {
                bill[1]= bill[1] / 2;
                Arrays.sort(bill);
                answer++;
            } else {
                continue;
            }
        }
        return answer;
    }
}