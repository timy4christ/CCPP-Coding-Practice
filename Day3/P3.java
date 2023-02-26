public class P3 {
    // not a good approach as it increases junk of unreferenced strings in the heap
    public static void main1(String[] args) {
        String str= "I love India";
        String revStr = "";
        
        for(int i=str.length()-1; i>=0; i--){
            revStr += str.charAt(i);
        }

        System.out.println(revStr);
    }
    // with string buffer we avoid the issue
    public static void main(String[] args) {
        StringBuffer str= new StringBuffer("I love India");
        StringBuffer revStr = new StringBuffer();
        
        for(int i=str.length()-1; i>=0; i--){
            revStr.append(str.charAt(i));
        }

        System.out.println(revStr);
    }
}
