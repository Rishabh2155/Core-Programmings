import java.util.ArrayList;
import java.util.Scanner;

class NumberCheckerFactors {

    public static int[] factors(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) if (num % i == 0) list.add(i);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int greatestFactor(int[] f) { return f[f.length - 1]; }

    public static int sumFactors(int[] f) { int sum=0; for(int x:f) sum+=x; return sum; }

    public static long productFactors(int[] f) { long p=1; for(int x:f) p*=x; return p; }

    public static long productCubeFactors(int[] f) { long p=1; for(int x:f) p*=Math.pow(x,3); return p; }

    public static boolean isPerfect(int num) {
        int sum=0; for(int i=1;i<=num/2;i++) if(num%i==0) sum+=i; return sum==num;
    }

    public static boolean isAbundant(int num) {
        int sum=0; for(int i=1;i<=num/2;i++) if(num%i==0) sum+=i; return sum>num;
    }

    public static boolean isDeficient(int num) {
        int sum=0; for(int i=1;i<=num/2;i++) if(num%i==0) sum+=i; return sum<num;
    }

    public static int factorial(int n){ int f=1; for(int i=2;i<=n;i++) f*=i; return f; }

    public static boolean isStrong(int num){
        int sum=0; for(int d:NumberCheckerSpecialNumbers.digits(num)) sum+=factorial(d);
        return sum==num;
    }
}

public class DemoFactors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();

        int[] f=NumberCheckerFactors.factors(num);
        System.out.println("Factors: "+java.util.Arrays.toString(f));
        System.out.println("Greatest factor: "+NumberCheckerFactors.greatestFactor(f));
        System.out.println("Sum of factors: "+NumberCheckerFactors.sumFactors(f));
        System.out.println("Product of factors: "+NumberCheckerFactors.productFactors(f));
        System.out.println("Product of cube of factors: "+NumberCheckerFactors.productCubeFactors(f));
        System.out.println("Perfect? "+NumberCheckerFactors.isPerfect(num));
        System.out.println("Abundant? "+NumberCheckerFactors.isAbundant(num));
        System.out.println("Deficient? "+NumberCheckerFactors.isDeficient(num));
        System.out.println("Strong? "+NumberCheckerFactors.isStrong(num));
    }
}
