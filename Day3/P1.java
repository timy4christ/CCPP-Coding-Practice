public class P1 {
    public static void main(String[] args) {
        String s = "malayalam";

        char[] ch = new char[s.length()];
        boolean flag = true;
        // for(int i=0; i<s.length(); i++){
        // ch[i] = s.charAt(i);
        // }

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
                continue;
            } else {
                flag = false;
            }
        }

        if (flag) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }

    }
}