import java.util.*;

public class VowelConsonantCount {
    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] countVC(String s) {
        int v=0,c=0;
        for (int i=0;i<s.length();i++) {
            String type=checkChar(s.charAt(i));
            if (type.equals("Vowel")) v++;
            else if (type.equals("Consonant")) c++;
        }
        return new int[]{v,c};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();

        int[] res=countVC(text);
        System.out.println("Vowels: "+res[0]);
        System.out.println("Consonants: "+res[1]);
    }
}
