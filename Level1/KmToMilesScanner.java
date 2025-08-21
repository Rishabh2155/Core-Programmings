import java.util.Scanner;

class KmToMilesScanner {
    public static void main(String[] args) {
        double km, miles;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();   // take user input

        miles = km / 1.6;  // since 1 mile = 1.6 km

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        input.close();
    }
}
