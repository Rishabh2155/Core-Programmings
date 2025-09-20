import java.util.Scanner;

class SubStringDemo {
    static String mySub(String s, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            sub += s.charAt(i);
        }
        return sub;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String s1 = mySub(text, start, end);
        String s2 = text.substring(start, end);

        System.out.println("My Substring: " + s1);
        System.out.println("Built-in Substring: " + s2);
        System.out.println("Both same? " + s1.equals(s2));
    }
}
