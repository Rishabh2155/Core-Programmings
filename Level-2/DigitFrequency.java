import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp=num, count=0;
        while(temp>0){ count++; temp/=10; }
        int[] digits=new int[count];
        temp=num;
        for(int i=0;i<count;i++){
            digits[i]=temp%10;
            temp/=10;
        }
        int[] freq=new int[10];
        for(int d:digits) freq[d]++;
        System.out.println("Digit Frequency:");
        for(int i=0;i<10;i++){
            if(freq[i]>0)
                System.out.println(i + " → " + freq[i]);
        }
    }
}
