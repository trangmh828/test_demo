import java.util.*;

public class GiaiThuaDemo1 {
    public static void main(String[] args) {
        // Giai thua bang cach nhap scanner
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter a value:");
            int n = scan.nextInt();
            int giaiThua = 1;
            if (n == 0 || n == 1) {
                System.out.println("n = 1");
            } else if (n > 1) {
                // Dung ham for de tinh giai thua
                for (int i = 1; i <= n; i++) {
                    giaiThua *= i;
                }
                System.out.println("Factorial of " + n + " is: " + giaiThua);
            }  else {
                System.out.println("Please enter valid number");
            }
        } catch (Exception e) {
            System.out.println("Please enter valid number");
        }
    }
}