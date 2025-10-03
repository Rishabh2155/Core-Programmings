import java.util.Scanner;

class NumberChecker2 {

    // Count digits
    public static int countDigits(int num) {
        int count = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    // Store digits in array
    public static int[] getDigitsArray(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        int temp = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    // Check Harshad number
    public static boolean isHarshad(int[] digits) {
        int sum = sumOfDigits(digits);
        int number = 0;
        for (int d : digits) number = number * 10 + d;
        return number % sum == 0;
    }

    // Frequency of digits using 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // [digit, frequency]
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }
}

public class NumberCheckerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = NumberChecker2.getDigitsArray(num);

        System.out.println("Sum of digits: " + NumberChecker2.sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + NumberChecker2.sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad number? " + NumberChecker2.isHarshad(digits));

        System.out.println("Digit frequencies:");
        int[][] freq = NumberChecker2.digitFrequency(digits);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + freq[i][0] + ": " + freq[i][1]);
        }
    }
}
