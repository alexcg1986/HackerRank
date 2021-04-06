import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);
		final String A = sc.next();
		final String B = sc.next();
		sc.close();

		System.out.println(A.length() + B.length());
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " "
				+ Character.toUpperCase(B.charAt(0)) + B.substring(1));
	}

}
