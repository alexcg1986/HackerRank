import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int[] arr = new int[N];
		int sum = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			int val = 0;

			for (int j = i; j >= 0; j--) {
				val += arr[j];
				if (val < 0)
					sum++;
			}
		}
		sc.close();
		System.out.println(sum);
	}
}
