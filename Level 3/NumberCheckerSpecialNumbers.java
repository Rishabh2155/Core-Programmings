import java.util.Scanner;

class NumberCheckerSpecialNumbers {

    public static int[] digits(int num) {
        String s = String.valueOf(num);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int num) {
        int sq = num * num, sum = 0;
        for (int d : digits(sq)) sum += d;
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, prod = 1;
        for (int d : digits(num)) { sum += d; prod *= d; }
        return sum == prod;
    }

    public static boolean isAutomorphic(int num) {
        int sq = num * num;
        String sNum = String.valueOf(num), sSq = String.valueOf(sq);
        return sSq.endsWith(sNum);
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
}

public class DemoSpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Prime? " + NumberCheckerSpecialNumbers.isPrime(num));
        System.out.println("Neon? " + NumberCheckerSpecialNumbers.isNeon(num));
        System.out.println("Spy? " + NumberCheckerSpecialNumbers.isSpy(num));
        System.out.println("Automorphic? " + NumberCheckerSpecialNumbers.isAutomorphic(num));
        System.out.println("Buzz? " + NumberCheckerSpecialNumbers.isBuzz(num));
    }
}
