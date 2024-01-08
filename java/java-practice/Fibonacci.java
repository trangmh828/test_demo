import java.util.*;

public class Fibonacci {
    public static int countFibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i ++) {
                f0 = f1;
                f1 = fn;
                fn = f1 + f0;
            }
            return fn;
        }
    }   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so:");
        int n = scanner.nextInt();
        System.out.println("Day Fibonaci la:");
        for (int i = 0; i < n; i++) {
            System.out.print(countFibonacci(i) + " ");
        }
    }

}
