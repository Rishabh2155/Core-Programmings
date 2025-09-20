
import java.util.Scanner;

class LowerCaseDemo {
    static String myLowerCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char)(c + 32);  
            } else {
                result += c;
            }
        }
        return result;
    }

    static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String myText = myLowerCase(text);
        String builtIn = text.toLowerCase();

        System.out.println("My Lowercase: " + myText);
        System.out.println("Built-in Lowercase: " + builtIn);
        System.out.println("Both same? " + compare(myText, builtIn));
    }
}
