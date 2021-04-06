import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int TEST_CASES = Integer.valueOf(sc.nextLine());

		for (int i = 0; i < TEST_CASES; i++) {
			try {
				Pattern.compile(sc.nextLine());
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}
		}
		sc.close();
	}
}
