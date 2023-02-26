public class P10 {
    // resulted array is unsorted with zero to the end
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 3, 4 };

        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 0 && arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else {
                i++;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
