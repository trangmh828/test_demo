import java.util.*;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter a value:");
            int n = scanner.nextInt();
            if (n > 0) {
                if (laSoNguyenTo(n)) {
                    System.out.println("This value is the prime");
                } else {
                    System.out.println("This value isn't the prime");
                }
            } else {
                System.out.println("This value isn't the prime");
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid value");
        }
    }

    public static boolean laSoNguyenTo(int n){
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }  
}