import java.util.HashMap;
import java.util.Map;

public class P15 {
    public static void main(String[] args) {
        
        //Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,1,4,4,4,4,4,5,8,3,3,3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }

        int maxValue = -1;
        int key = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(maxValue < entry.getValue()){
                maxValue = entry.getValue();
                key = entry.getKey();
            }
        }
        System.out.println("Max Frequency: " + key + " --> " + maxValue);





    }
}
