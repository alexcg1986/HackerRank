import java.util.Scanner;

class UsernameValidator {
	public static final String REGULAR_EXPRESSION = "^[A-Za-z]{1}[A-Za-z0-9_]{7,29}";
}

public class Solution {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.valueOf(sc.nextLine());
		while (n-- != 0) {
			final String USER_NAME = sc.nextLine();

			if (USER_NAME.matches(UsernameValidator.REGULAR_EXPRESSION)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}