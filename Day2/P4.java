import java.util.Scanner;

// missing Number in given array of 1 to N
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N - 1];

        for (int i = 0; i < N - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i : arr) {
            System.out.print(i + " ");
            sum += i;
        }

        int actualSum = N * (N + 1) / 2;

        int missingNumber = actualSum - sum;

        System.out.println("\nMissing number from array : " + missingNumber);

    }
}
