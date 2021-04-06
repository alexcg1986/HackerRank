import java.util.Scanner;

public class Solution {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		final int N = sc.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int i = 1; i < 11; i++)
			System.out.println(N + " x " + i + " = " + N * i);
		sc.close();
	}
}
