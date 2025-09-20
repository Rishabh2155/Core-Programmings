import java.util.Scanner;

class StringIndexDemo {
    static void generateError(String s) {
        // Accessing index beyond length
        System.out.println(s.charAt(s.length())); 
    }

    static void handleError(String s) {
        try {
            System.out.println(s.charAt(s.length())); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled: " + e);
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
