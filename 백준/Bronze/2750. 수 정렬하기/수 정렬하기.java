import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            intArr[i] = m;
        }

        Arrays.sort(intArr);
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
