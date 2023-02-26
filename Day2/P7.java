import java.util.Map;
import java.util.TreeMap;

public class P7 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,7,2};
        int[] arr2 = {7,4,6,1};

        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for(int i=0; i<arr1.length; i++){
            if(map.containsKey(arr1[i])){
                continue;
            }else {
                map.put(arr1[i],1);
            }
        }

        for(int i=0; i<arr2.length; i++){
            if(map.containsKey(arr2[i])){
                continue;
            }else {
                map.put(arr2[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + " ");
        }
    }
}
