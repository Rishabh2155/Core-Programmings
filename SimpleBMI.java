import java.util.*;

public class SimpleBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many persons? ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("Enter weight of person " + i + ": ");
            double w = sc.nextDouble();
            System.out.print("Enter height of person " + i + ": ");
            double h = sc.nextDouble();

            double bmi = w / (h*h);
            String status;
            if(bmi <= 18.4) status="Underweight";
            else if(bmi <= 24.9) status="Normal";
            else if(bmi <= 39.9) status="Overweight";
            else status="Obese";

            System.out.println("Person " + i + "Height: " + h + "m, Weight: " + w + "kg, BMI: " + String.format("%.2f",bmi) + ", Status: " + status);
        }
    }
}
