class Solution {
    public String solution(String my_string, int[] index_list) {
        String str = "";
        for ( int n : index_list) {
             char ch = my_string.charAt(n);
             str += Character.toString(ch);
        } 
        return str;
    }
}