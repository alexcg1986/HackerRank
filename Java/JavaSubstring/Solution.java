import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final String S = sc.next();
		final int START = sc.nextInt();
		final int END = sc.nextInt();
		sc.close();

		System.out.println(S.substring(START, END));
	}
}
