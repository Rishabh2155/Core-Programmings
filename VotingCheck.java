
import java.util.*;

public class VotingCheck {
    public static int[] randomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = (int)(Math.random()*90 + 10); // random 2-digit
        return ages;
    }

    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "false";
            else if (ages[i] >= 18) result[i][1] = "true";
            else result[i][1] = "false";
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.println("Age\tCanVote");
        for (String[] row : arr) System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        int[] ages = randomAges(10);
        String[][] table = checkVoting(ages);
        display(table);
    }
}
