import java.util.*;

public class DigitsLargestDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int maxDigit=10, index=0;
        int[] digits = new int[maxDigit];

        while(num!=0){
            if(index==maxDigit){
                maxDigit+=10;
                int[] temp=new int[maxDigit];
                for(int i=0;i<digits.length;i++) temp[i]=digits[i];
                digits=temp;
            }
            digits[index++]=num%10;
            num/=10;
        }

        int first=0,second=0;
        for(int i=0;i<index;i++){
            if(digits[i]>first){
                second=first;
                first=digits[i];
            }else if(digits[i]>second && digits[i]!=first){
                second=digits[i];
            }
        }

        System.out.println("Largest: "+first);
        System.out.println("Second Largest: "+second);
    }
}
