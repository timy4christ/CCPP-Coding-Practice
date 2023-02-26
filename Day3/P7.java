import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int xor = 0;

        for (int i = 0; i < s1.length(); i++) {
            xor ^= s1.charAt(i);
        }

        for (int i = 0; i < s2.length(); i++) {
            xor ^= s2.charAt(i);
        }

        if (xor == 0) {
            System.out.println(s1 + " is anagram to " + s2);
        } else {
            System.out.println(s1 + " is not anagram to " + s2);
        }
    }
}
