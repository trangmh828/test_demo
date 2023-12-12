public class GiaiThuaDemo1 {
    public static void main(String[] args) {
        System.out.println("Ket qua cua giai thua demo1 la: " + tinhGiaiThua(5));
    }

    public static long tinhGiaiThua (int a) {
        long giai_thua = 1;
        if (a == 0 || a == 1) {
            return giai_thua;
        } else {
            for (int i = 1; i <= a; i++) {
                giai_thua = giai_thua * i;
            }
            return giai_thua;
        }
    }
}