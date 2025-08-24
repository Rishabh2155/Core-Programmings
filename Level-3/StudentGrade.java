import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        double phy = sc.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chem = sc.nextDouble();
        System.out.print("Enter Maths marks: ");
        double math = sc.nextDouble();
        double avg = (phy + chem + math) / 3;

        String grade = "";
        String remark = "";
        if (avg >= 80) {
            grade = "A";
            remark = "Level 4, above agency-normalized standards";
        } else if (avg >= 70) {
            grade = "B";
            remark = "Level 3, at agency-normalized standards";
        } else if (avg >= 60) {
            grade = "C";
            remark = "Level 2, below but approaching agency-normalized standards";
        } else if (avg >= 50) {
            grade = "D";
            remark = "Level 1, well below agency-normalized standards";
        } else if (avg >= 40) {
            grade = "E";
            remark = "Level 1, too below agency-normalized standards";
        } else {
            grade = "R";
            remark = "Remedial standards";
        }
        System.out.println("\n--- Result ---");
        System.out.println("Average Marks: " + String.format("%.2f", avg) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remark);

    }
}
