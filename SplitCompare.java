import java.util.*;

public class SplitCompare {
    public static String[] mySplit(String text) {
        int spaces = 1;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ') spaces++;

        String[] words = new String[spaces];
        int start = 0, idx = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = text.substring(start);
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] arr1 = mySplit(text);
        String[] arr2 = text.split(" ");

        System.out.println("Comparison Result: " + compareArrays(arr1, arr2));
    }
}
