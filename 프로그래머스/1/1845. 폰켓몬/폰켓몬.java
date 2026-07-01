import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int maxSelect = nums.length / 2;
        HashSet<Integer> pokemonSet = new HashSet<>();
        
        for (int num : nums) {
            pokemonSet.add(num);
        }
        
        int uniqueTypeCount = pokemonSet.size();
        return Math.min(uniqueTypeCount, maxSelect);
    }
}