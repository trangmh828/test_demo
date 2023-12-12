import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so de kiem tra:");
        int n = scanner.nextInt();
        System.out.print("Ket qua: ");
        if (isPrimeNumber(n)) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong la so nguyen to.");
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return true;
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
