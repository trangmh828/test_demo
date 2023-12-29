public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Tinh tong cua 3 va 5");
        testTinhTong(3, 5);
    }

    public static void testTinhTong(int a, int b) {
        int sum = a + b;
        System.err.println(sum);
    }
}