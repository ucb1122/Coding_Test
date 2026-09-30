class Solution {
    
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        int start = 0;
        int sum = 0;
        
        dfs(start, sum, numbers, target);
        
        return answer;
    }
    
    public void dfs(int current, int sum, int[] numbers, int target) {
        
        if (current == numbers.length) {
            if (sum == target) {
                answer++; 
            }
            return;
        }
      
        dfs(current + 1, sum + numbers[current], numbers, target);
        dfs(current + 1, sum - numbers[current], numbers, target);
    }
}