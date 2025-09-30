import java.util.*;

public class WordsWithLength {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) { s.charAt(count); count++; }
        } catch (Exception e) {}
        return count;
    }

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

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = mySplit(text);
        String[][] table = wordWithLength(words);

        System.out.println("Word\tLength");
        for (String[] row : table)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}
