import java.util.*;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many persons? ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; 
        String[] status = new String[n];

        for(int i=0;i<n;i++){
            double w,h;
            do{
                System.out.print("Enter weight for person " + (i+1) + ": ");
                w = sc.nextDouble();
            }while(w<=0);
            do{
                System.out.print("Enter height for person " + (i+1) + ": ");
                h = sc.nextDouble();
            }while(h<=0);

            double bmi = w/(h*h);
            personData[i][0]=w; personData[i][1]=h; personData[i][2]=bmi;

            if(bmi<=18.4) status[i]="Underweight";
            else if(bmi<=24.9) status[i]="Normal";
            else if(bmi<=39.9) status[i]="Overweight";
            else status[i]="Obese";
        }

        System.out.println("\nResult:");
        for(int i=0;i<n;i++){
            System.out.println("Person " + (i+1) +  " | W: " + personData[i][0] + "kg" +" | H: " + personData[i][1] + "m" + " | BMI: " + String.format("%.2f",personData[i][2]) +" | Status: " + status[i]);
        }
    }
}
