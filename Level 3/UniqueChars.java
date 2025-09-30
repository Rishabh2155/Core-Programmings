import java.util.*;

public class UniqueChars {
    public static int getLength(String s) {
        int c = 0;
        try { while (true) { s.charAt(c); c++; } }
        catch (Exception e) {}
        return c;
    }

    public static char[] findUnique(String s) {
        int len = getLength(s);
        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    unique = false; break;
                }
            }
            if (unique) temp[count++] = ch;
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] unique = findUnique(text);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
    }
}
