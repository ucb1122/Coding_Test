class Solution {
    public int solution(int n, String control) {
        char[] chArr = control.toCharArray();
        
        for (char c : chArr) {
            switch (c) {
                case 'w' : 
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd' :
                    n += 10;
                    break;
                case 'a' :
                    n -= 10;
                    break;
            } 
        }
        return n;
    }
}