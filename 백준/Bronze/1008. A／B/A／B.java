import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            System.out.println((double) a / b);
        } catch (ArithmeticException e) {
            System.out.println("error");
        }
    }
}