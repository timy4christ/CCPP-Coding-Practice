
// second largest element in an array
import java.util.Arrays;

public class P2 {
    // with sorting ( wont work if the array have duplicates )
    public static void main1(String[] args) {
        int arr[] = { 10, 15, 46, 78, 56, 2 };

        Arrays.sort(arr);
        System.out.println("Second largest element in array is " + arr[arr.length - 2]);
    }

    // without sorting
    public static void main(String[] args) {
        // int arr[] = {10, 15, 46, 78, 56, 2};
        // int arr[] = { 1, 4, 2, 4, 7, 5, 9 };
        int arr[] = { 1, 1, 1, 4, 2, 6, 3 };

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] == arr[i]) {
                largest = arr[i];
            } else if (arr[i + 1] > arr[i]) {
                secondLargest = largest;
                largest = arr[i + 1];
            } else if (arr[i + 1] != arr[i] && arr[i + 1] > secondLargest) {
                secondLargest = arr[i + 1];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Second Largest element: " + secondLargest);
    }
}
