class Solution {
    
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        int sum = 0;
        int current = 0;
        
        dfs(current, sum, numbers, target);
        
        return answer;
    }
    
    void dfs(int current, int sum, int[] numbers, int target) {
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
