public class P5 {
    public static void main(String[] args) {
        String str = "I love India";
        str = str.toLowerCase();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Vowel Count: " + count);
    }
}
