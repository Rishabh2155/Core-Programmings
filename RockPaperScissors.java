import java.util.*;

public class RockPaperScissors {
    public static String compChoice() {
        int val = (int)(Math.random()*3);
        if (val == 0) return "rock";
        else if (val == 1) return "paper";
        else return "scissors";
    }

    public static String winner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if (user.equals("rock") && comp.equals("scissors")) return "user";
        if (user.equals("rock") && comp.equals("paper")) return "comp";
        if (user.equals("paper") && comp.equals("rock")) return "user";
        if (user.equals("paper") && comp.equals("scissors")) return "comp";
        if (user.equals("scissors") && comp.equals("paper")) return "user";
        if (user.equals("scissors") && comp.equals("rock")) return "comp";
        return "draw";
    }

    public static String[][] calcStats(int userWins, int compWins, int total) {
        String[][] arr = new String[2][3];
        arr[0][0] = "User"; arr[0][1] = String.valueOf(userWins);
        arr[0][2] = String.valueOf(userWins*100/total) + "%";
        arr[1][0] = "Comp"; arr[1][1] = String.valueOf(compWins);
        arr[1][2] = String.valueOf(compWins*100/total) + "%";
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        int userWins = 0, compWins = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next();
            String comp = compChoice();
            String win = winner(user, comp);

            if (win.equals("user")) userWins++;
            else if (win.equals("comp")) compWins++;

            System.out.println("Game " + i + ": User=" + user + " Computer=" + comp + " → " + win);
        }

        String[][] stats = calcStats(userWins, compWins, n);
        System.out.println("\nPlayer\tWins\tWin%");
        for (String[] row : stats) System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
    }
}
