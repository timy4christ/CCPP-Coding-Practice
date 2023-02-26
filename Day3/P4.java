public class P4 {
    public static void main1(String[] args) {
        String str = "I love India";

        String[] words = str.split(" ");

        System.out.println("Words : " + words.length);
    }

    public static void main(String[] args) {
        String str = "     I     love India so much       ";
        int count = 0;
        str = str.trim();
        for (int i = 0; i < str.length()-1; i++) {

            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("Words : " + (count + 1));
    }

}
