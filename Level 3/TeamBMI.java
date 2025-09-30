import java.util.*;

public class TeamBMI {
    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static String[][] computeBMI(double[][] hw) {
        String[][] result = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double w = hw[i][0];
            double h = hw[i][1] / 100.0;  // cm → m
            double bmi = w / (h * h);
            result[i][0] = String.valueOf(w);
            result[i][1] = String.valueOf(hw[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = bmiStatus(bmi);
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.println("Weight(kg)\tHeight(cm)\tBMI\tStatus");
        for (String[] row : arr)
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) for person " + (i+1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) for person " + (i+1) + ": ");
            hw[i][1] = sc.nextDouble();
        }

        String[][] table = computeBMI(hw);
        display(table);
    }
}
