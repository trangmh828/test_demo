public class ExceptionJava {
    public static void main(String[] args) {
        try {
            String[] username = new String[5];
            username[0].length();
            System.out.println(username[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Co loi xay ra " + e);
        } catch (NullPointerException e) {
            System.out.println("Co gia tri null " + e.getMessage());
        }

        try {
            int a = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
    
}