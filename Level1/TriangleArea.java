import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle (in inches): ");
        double height = input.nextDouble();

        // Area in square inches
        double areaInInches = 0.5 * base * height;

        // 1 inch = 2.54 cm → 1 in² = (2.54 * 2.54) cm²
        double areaInCm = areaInInches * 2.54 * 2.54;

        System.out.println("The area of triangle is " + areaInInches +
                           " square inches and " + areaInCm +
                           " square centimeters");

        input.close();
    }
}
