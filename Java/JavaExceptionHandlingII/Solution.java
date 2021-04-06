import java.util.Scanner;

class MyCalculator {
	long power(int n, int p) throws Exception {
		if (n < 0 || p < 0)
			throw new Exception("n or p should not be negative.");
		else if (n == 0 && p == 0)
			throw new Exception("n and p should not be zero.");
		else
			return (long) Math.pow(n, p);
	}
}

public class Solution {
	public static final MyCalculator myCal = new MyCalculator();
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNextInt()) {
			final int N = sc.nextInt();
			final int P = sc.nextInt();

			try {
				System.out.println(myCal.power(N, P));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}