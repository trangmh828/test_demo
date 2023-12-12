public class GiaiThuaDemo2 {
    public static void main(String[] args) {
        System.out.println("Ket qua cua giai thua demo2 la: " + tinhGiaiThua(5));
    }

    public static long tinhGiaiThua(int n) { 
       if (n > 0) {
            return n * tinhGiaiThua(n-1);
       } else {
            return 1;
       }
    }
}
