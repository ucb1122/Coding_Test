class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int castTime = bandage[0];
        int healPerSec = bandage[1];
        int bonusHeal = bandage[2];
        
        int currentHealth = health;
        int lastAttackTime = 0;
        
        for (int[] attack : attacks) {
            int attackTime = attack[0];
            int damage = attack[1];
            
            int timeDiff = attackTime - lastAttackTime - 1;
            
            if (timeDiff > 0) {
                int totalHeal = timeDiff * healPerSec + (timeDiff / castTime) * bonusHeal;
                currentHealth = Math.min(health, currentHealth + totalHeal);
            }
            currentHealth -= damage;
            if (currentHealth <= 0) {
                return -1;
            }
            lastAttackTime = attackTime;
        }
        return currentHealth;
    }
}