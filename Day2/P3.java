// second smallest element in an array

public class P3 {
    public static void main(String[] args) {
        // int[] arr = {10, 15, 46, 78, 56, 2};
        // int[] arr = { 1, 1, 2, 4, 4, 7, 5 };
        int[] arr = { 1, 1 };

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] == arr[i]) {
                smallest = arr[i];
            } else if (arr[i + 1] < arr[i] && arr[i + 1] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i + 1];
            } else if (arr[i + 1] != arr[i] && arr[i + 1] < secondSmallest) {
                secondSmallest = arr[i + 1];
                smallest = arr[i];
            }
        }

        System.out.println("Smallest : " + smallest);
        System.out.println("Second Smallest : "
                + (secondSmallest == Integer.MAX_VALUE ? " No second smallest element" : secondSmallest));

    }
}
