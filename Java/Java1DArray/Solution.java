import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		sc.close();

		final int[] arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}