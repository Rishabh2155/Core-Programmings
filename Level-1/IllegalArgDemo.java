
import java.util.Scanner;

class IllegalArgDemo {
    static void generateError(String s) {
        // start > end
        System.out.println(s.substring(5, 2));
    }

    static void handleError(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // will crash
        try {
            generateError(text);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        // handled
        handleError(text);
    }
}
