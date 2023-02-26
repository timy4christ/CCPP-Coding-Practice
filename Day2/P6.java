import java.util.ArrayList;
import java.util.List;

public class P6 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,7};
        int[] arr2 = {1,4,6,7};

        List<Integer> lst = new ArrayList<>();
        
        int i=0,j=0;
        while(i < arr1.length && j < arr2.length ){
            if(arr1[i] < arr2[i]){
                i++;
            } else if(arr1[i] == arr2[j]){
                lst.add(arr1[i]);
                i++;
                j++;
            } else {
                j++;
            }
        }

        System.out.println(lst);
    }
}
