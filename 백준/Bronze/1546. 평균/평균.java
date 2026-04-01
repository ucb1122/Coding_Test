import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
               
       long sum = 0;
       long max = 0;
       for(int i = 0; i < arr.length; i++) {
           int temp = scanner.nextInt();
           if(temp>max) {
               max = temp;
           }
           sum += temp;
       }
        System.out.println(sum*100.0/max/n);
    }
}