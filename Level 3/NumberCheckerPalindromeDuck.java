import java.util.Arrays;
import java.util.Scanner;

class NumberCheckerPalindromeDuck {

    public static int[] digits(int num) {
        String s = String.valueOf(num);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static int count(int[] d) { return d.length; }

    public static int[] reverse(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++) r[i] = d[d.length - 1 - i];
        return r;
    }

    public static boolean compare(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int num) {
        int[] d = digits(num);
        int[] r = reverse(d);
        return compare(d, r);
    }

    public static boolean isDuck(int num) {
        int[] d = digits(num);
        for (int n : d) if (n != 0) return true;
        return false;
    }
}

public class DemoPalindromeDuck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Digit count: " + NumberCheckerPalindromeDuck.count(NumberCheckerPalindromeDuck.digits(num)));
        System.out.println("Reversed digits: " + Arrays.toString(NumberCheckerPalindromeDuck.reverse(NumberCheckerPalindromeDuck.digits(num))));
        System.out.println("Palindrome? " + NumberCheckerPalindromeDuck.isPalindrome(num));
        System.out.println("Duck number? " + NumberCheckerPalindromeDuck.isDuck(num));
    }
}
