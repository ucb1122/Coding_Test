class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int pLen = p.length();
        
        long pValue = Long.parseLong(p); 
        
        for (int i = 0; i <= t.length() - pLen; i++) {
            String sub = t.substring(i, i + pLen);
            long subValue = Long.parseLong(sub);
                        if (subValue <= pValue) {
                count++;
            }
        }
        return count;
    }
}