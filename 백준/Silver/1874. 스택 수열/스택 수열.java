import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1; 
        boolean flag = true;
        StringBuilder bf = new StringBuilder();

        for (int i = 0; i < A.length; i++) {
            int su = A[i];

            if (su >= num) {
                while (su >= num) {
                    stack.push(num++); 
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                int top = stack.pop(); 
                if (top > su) {
                    System.out.println("NO");
                    flag = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }

        if (flag) {
            System.out.print(bf.toString());
        }
    }
}