import java.util.Scanner;

public class FibonacciDeQuy {
    public static int getFibonacci(int n) {
        int c;
        if  (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
            
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
    }
}
