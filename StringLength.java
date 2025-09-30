import java.util.*;

public class StringLength {
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("User Defined Length: " + findLength(str));
        System.out.println("Built-in Length: " + str.length());
    }
}
