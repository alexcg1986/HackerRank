import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}
		sc.close();

		Arrays.sort(arr, 0, N, (previous, next) -> (new BigDecimal(next).compareTo(new BigDecimal(previous))));

		Arrays.asList(arr).forEach(System.out::println);
	}
}