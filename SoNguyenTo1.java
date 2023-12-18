import java.util.Scanner;

public class SoNguyenTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so:");
        int n = scanner.nextInt();
        System.out.printf("%d so nguyen dau tien la: \n", n);
        int dem = 0;
        int i = 2;
        while (dem < n) {
            if (soNguyenTo(i)) {
                System.out.print(i + " ");
                dem++;
            }              
            i++;
        }
    }

    public static boolean soNguyenTo (int n) {
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
