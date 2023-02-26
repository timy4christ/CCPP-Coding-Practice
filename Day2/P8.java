import java.util.ArrayList;

public class P8 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 7 };
        int[] arr2 = { 1, 4, 6, 7, 8, 10};

        ArrayList<Integer> unionArray = new ArrayList<>();
        //int[] unionArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0;
        //int z = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr1[j] && !unionArray.contains(arr1[i])){
                unionArray.add(arr1[i]);
                i++;
            } else if(arr1[i] == arr1[j] && !unionArray.contains(arr1[i])){
                unionArray.add(arr1[i]);
                i++;
                j++;
            } else if(arr1[i] > arr1[j] && !unionArray.contains(arr2[i])){
                unionArray.add(arr2[i]);
                j++;
            }
        }




        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j] && !unionArray.contains(arr1[i])) {
                //unionArray[z++] = arr1[i];
                unionArray.add(arr1[i]);
                i++;
            } else {
                //unionArray[z++] = arr2[j];
                unionArray.add(arr2[i]);
                j++;
            }
        }

        while (i < arr1.length) {
            unionArray[z++] = arr1[i];
            i++;
        }

        while (j < arr1.length) {
            unionArray[z++] = arr2[j];
            j++;
        }

        for (int x : unionArray) {
            System.out.print(x + " ");
        }

    }
}
