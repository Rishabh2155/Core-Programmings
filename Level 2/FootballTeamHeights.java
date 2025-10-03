import java.util.Scanner;

public class FootballTeamHeights {

    public static void main(String[] args) {
        int[] heights = new int[11];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the heights of 11 players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }
        System.out.print("Heights of players: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();
        int totalHeight = sum(heights);
        double meanHeight = mean(heights);
        int shortestHeight = shortest(heights);
        int tallestHeight = tallest(heights);
        System.out.println("Total sum of heights: " + totalHeight + " cm");
        System.out.println("Mean height: " + meanHeight + " cm");
        System.out.println("Shortest height: " + shortestHeight + " cm");
        System.out.println("Tallest height: " + tallestHeight + " cm");
    }
    public static int sum(int[] arr) {
        int total = 0;
        for (int h : arr) {
            total += h;
        }
        return total;
    }
    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }
    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }
    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }
}
