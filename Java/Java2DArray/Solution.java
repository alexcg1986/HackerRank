import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		final int N = 6;
		final int[][] arr = new int[N][N];
		int maxSum = Integer.MIN_VALUE;
		final Scanner sc = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
				if (i > 1 && j > 1) {
					int sum = arr[i][j] + arr[i][j - 1] + arr[i][j - 2] + arr[i - 1][j - 1] + arr[i - 2][j]
							+ arr[i - 2][j - 1] + arr[i - 2][j - 2];
					if (sum > maxSum)
						maxSum = sum;
				}
			}
		}
		sc.close();
		System.out.println(maxSum);
	}
}
