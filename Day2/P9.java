import java.util.HashSet;

public class P9 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 7, 2 };
        int[] arr2 = { 7, 4, 6, 1 };

        HashSet<Integer> set1 = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set1.add(arr2[i]);
        }

        for (int i : set1) {
            System.out.print(i + " ");
        }

    }
}