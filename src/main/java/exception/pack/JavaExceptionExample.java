package exception.pack;

public class JavaExceptionExample {
    public static void main(String[] args) {
        try {
            int data = 100/0;

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
