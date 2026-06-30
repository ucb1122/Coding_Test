class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int wordIndex = 0;
        String[] chars = s.split("");
        
        for (String c : chars) {
            if (c.equals(" ")) {
                wordIndex = 0;
                answer.append(" ");
            } else {
                if (wordIndex % 2 == 0) {
                    answer.append(c.toUpperCase());
                } else {
                    answer.append(c.toLowerCase());
                }
                wordIndex++;
            }
        }
        return answer.toString();
    }
}