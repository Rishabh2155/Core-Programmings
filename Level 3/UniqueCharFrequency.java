import java.util.*;

public class UniqueCharFrequency {
    public static char[] uniqueChars(String s) {
        char[] temp = new char[s.length()];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) { unique = false; break; }
            }
            if (unique) temp[count++] = ch;
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++) result[i] = temp[i];
        return result;
    }

    public static String[][] freqWithUnique(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;

        char[] uniq = uniqueChars(s);
        String[][] result = new String[uniq.length][2];
        for (int i = 0; i < uniq.length; i++) {
            result[i][0] = String.valueOf(uniq[i]);
            result[i][1] = String.valueOf(freq[uniq[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] freq = freqWithUnique(text);
        System.out.println("Char\tFrequency");
        for (String[] row : freq)
            System.out.println(row[0] + "\t" + row[1]);
    }
}
