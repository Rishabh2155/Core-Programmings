import java.util.Scanner;

public class AthleteRounds {
    public static int calculateRounds(double a, double b, double c, double distance) {
        double perimeter = a + b + c;
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a of triangle (meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter side b of triangle (meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter side c of triangle (meters): ");
        double c = sc.nextDouble();

        int rounds = calculateRounds(a, b, c, 5000); // 5 km = 5000 meters
        System.out.println("The athlete must complete " + rounds + " rounds to cover 5 km.");

        sc.close();
    }
}
