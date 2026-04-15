class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String newStr = "";
        int index = 0;
        for (String str : my_strings) {
              newStr += str.substring(parts[index][0], parts[index][1] + 1);
              index++;
        }
        return newStr;
    }
}