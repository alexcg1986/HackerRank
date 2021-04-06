import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int T = sc.nextInt();
		final String[] pair_left = new String[T];
		final String[] pair_right = new String[T];

		for (int i = 0; i < T; i++) {
			pair_left[i] = sc.next();
			pair_right[i] = sc.next();
		}
		sc.close();

		final Set<String> namesHashSet = new HashSet<String>();

		for (int i = 0; i < T; i++) {
			namesHashSet.add(pair_left[i] + " " + pair_right[i]);
			System.out.println(namesHashSet.size());
		}
	}
}