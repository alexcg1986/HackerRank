import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final List<int[]> listOfArrays = new ArrayList<int[]>();

        for (int i = 0; i < n; i++) {
            final int K = sc.nextInt();
            final int[] arr = new int[K];

            for (int j = 0; j < K; j++) {
                arr[j] = sc.nextInt();
            }
            listOfArrays.add(arr);
        }
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            final int A = sc.nextInt();
            final int B = sc.nextInt();
            try {
                System.out.println(listOfArrays.get(A - 1)[B - 1]);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
