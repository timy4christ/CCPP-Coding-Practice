import java.util.HashMap;
import java.util.Map;

public class P14 {
    public static void main(String[] args) {
        
        //Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,1,3,4,4,4,4,4,5,8,8};

        int maxFreq = -1;
        int maxFreqInt = -1;
        for(int i=0; i<arr.length-1; i++){
            int count=1;
            if(arr[i+1] == arr[i]){
                count++;
            }

            if(count > maxFreq){
                maxFreq = count+1;
                maxFreqInt = arr[i];
            }
        }

        System.out.println(maxFreqInt + " --> " + maxFreq);



    }
}
