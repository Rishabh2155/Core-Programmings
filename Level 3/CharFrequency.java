import java.util.*;

public class CharFrequency {
    public static String[][] findFrequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        String[][] result = new String[s.length()][2];
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch] != 0) {
                result[idx][0] = String.valueOf(ch);
                result[idx][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; // avoid duplicates
                idx++;
            }
        }

        String[][] trimmed = new String[idx][2];
        for (int i = 0; i < idx; i++) trimmed[i] = result[i];
        return trimmed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] freq = findFrequency(text);
        System.out.println("Char\tFrequency");
        for (String[] row : freq)
            System.out.println(row[0] + "\t" + row[1]);
    }
}
