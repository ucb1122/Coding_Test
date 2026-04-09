class Solution {
    public int[] solution(int[] arr, int[][] queries) {        
        for (int [] arr2 : queries) {
            int first = arr2[0];
            int second = arr2[1];
            
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp; 
        }
        
        return arr;
    }
}