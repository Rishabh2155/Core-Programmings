import java.util.Scanner;

class NumberFormatDemo {
    static void generateError(String s) {
        // text is not number
        int num = Integer.parseInt(s);
        System.out.println("Number: " + num);
    }

    static void handleError(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e);
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
