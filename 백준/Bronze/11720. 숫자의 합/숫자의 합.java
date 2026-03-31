import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        char[] charNum = str.toCharArray();
        int sum = 0;
        for(int i = 0; i < charNum.length; i++ ){
            sum += charNum[i] - '0';
        }
        System.out.print(sum);
    }
}