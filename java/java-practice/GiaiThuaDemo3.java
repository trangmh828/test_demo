import java.util.*;

public class GiaiThuaDemo3 {
    public static void main(String[] args) {
        // Giai thua bang cach nhap scanner
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter a value:");
            int n = scan.nextInt();
            int giaiThua = 1;
            if (n >= 0) {
                int i = 1;
                // Dung ham while de tinh giai thua
                while (i <= n) {
                    giaiThua *= i;
                    i++;
                }
                System.out.println("Factorial of " + n + " is: " + giaiThua);
            } else {
                System.out.println("Please enter valid number");
            }
        } catch (Exception e) {
            System.out.println("Please enter valid number");
        }
    }
}