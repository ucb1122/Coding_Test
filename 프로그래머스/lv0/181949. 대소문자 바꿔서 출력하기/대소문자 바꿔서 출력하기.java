import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] chArr = a.toCharArray();
        
        for(int i = 0; i<a.length(); i++) {
            char ch = chArr[i];
            if ('A' <= ch && ch <= 'Z' ) {
                ch = (char) (chArr[i] + 32);
                System.out.print(ch);
            } else {
                ch = (char) (chArr[i] - 32);
                System.out.print(ch);
            }
        }
    }
}