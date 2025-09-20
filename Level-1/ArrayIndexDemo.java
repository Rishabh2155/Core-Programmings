import java.util.Scanner;

class ArrayIndexDemo {
    static void generateError(String arr[]) {
        // access invalid index
        System.out.println(arr[arr.length]);
    }

    static void handleError(String arr[]) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        String arr[] = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // without handling
        try {
            generateError(arr);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        // with handling
        handleError(arr);
    }
}
