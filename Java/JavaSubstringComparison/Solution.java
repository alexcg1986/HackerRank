import java.util.Scanner;

public class Solution {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = smallest;

		for (int i = 1; i <= s.length() - k; i++) {
			smallest = s.substring(i, i + k).compareTo(smallest) < 0 ? s.substring(i, i + k) : smallest;
			largest = s.substring(i, i + k).compareTo(largest) > 0 ? s.substring(i, i + k) : largest;

		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final String S = sc.next();
		final int K = sc.nextInt();
		sc.close();

		System.out.println(getSmallestAndLargest(S, K));
	}
}