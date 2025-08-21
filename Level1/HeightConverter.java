import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // 1 inch = 2.54 cm
        double totalInches = heightCm / 2.54;

        // 1 foot = 12 inches
        int feet = (int)(totalInches / 12);           
        int inches = (int)(totalInches % 12);        

        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + inches);

        input.close();
    }
}
