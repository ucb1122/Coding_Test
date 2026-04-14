class Solution {
    public String solution(String s) {
        String[] str = s.split(" ", -1);  
        for (int i = 0; i < str.length; i++) {
            if (str[i].isEmpty()) continue; 
            char ch = str[i].charAt(0);
            str[i] = Character.toUpperCase(ch) + str[i].substring(1).toLowerCase();
        }
        return String.join(" ", str); 
    }
}