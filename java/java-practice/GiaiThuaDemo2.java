import java.util.*;

public class GiaiThuaDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter a value:");
            int n = scanner.nextInt();
            if (n >= 0) {
                // Dung ham de quy de tinh giai thua
                System.out.println("Factorial of " + n + " is: " + factorialCalculate(n));
            } else {
                System.out.println("please enter valid value");
            }
        } catch (Exception e) {
            System.out.println("please enter valid value");
        }
    }

    public static int factorialCalculate (int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialCalculate(n -1);
        }
    }
}