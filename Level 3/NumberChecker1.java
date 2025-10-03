import java.util.Scanner;

class NumberChecker1 {

    // Method to count digits
    public static int countDigits(int num) {
        int count = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    // Method to store digits in array
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

    // Check Duck number (has non-zero digit)
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }

    // Check Armstrong number
    public static boolean isArmstrong(int[] digits) {
        int sum = 0;
        int n = digits.length;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        int number = 0;
        for (int d : digits) number = number * 10 + d;
        return sum == number;
    }

    // Find largest & second largest digits
    public static int[] largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Find smallest & second smallest digits
    public static int[] smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}

public class NumberCheckerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = NumberChecker1.getDigitsArray(num);

        System.out.println("Count of digits: " + NumberChecker1.countDigits(num));
        System.out.println("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Is Duck number? " + NumberChecker1.isDuckNumber(digits));
        System.out.println("Is Armstrong number? " + NumberChecker1.isArmstrong(digits));

        int[] largest = NumberChecker1.largestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = NumberChecker1.smallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
