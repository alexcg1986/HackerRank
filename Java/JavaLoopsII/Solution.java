import java.util.Scanner;

class Solution {
	public static void main(String[] argh) {
		final Scanner sc = new Scanner(System.in);
		final int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int total = a;
			for (int j = 0; j < n; j++) {
				total += Math.pow(2, j) * b;
				System.out.print(total + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
