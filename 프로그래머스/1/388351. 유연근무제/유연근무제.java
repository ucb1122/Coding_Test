class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int winnerCount = 0;
        
        for (int i = 0; i < schedules.length; i++) {
            int limitTimeInMinutes = (schedules[i] / 100) * 60 + (schedules[i] % 100) + 10;
            boolean isPass = true;
            
            for (int j = 0; j < 7; j++) {
                int today = (startday + j) % 7;
                if (today == 0) today = 7;
                
                if (today == 6 || today == 7) continue;
                
                int actualTimeInMinutes = (timelogs[i][j] / 100) * 60 + (timelogs[i][j] % 100);
                
                if (actualTimeInMinutes > limitTimeInMinutes) {
                    isPass = false;
                    break;
                }
            }
            if (isPass) {
                winnerCount++;
            }
        }
        return winnerCount;
    }
}