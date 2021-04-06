import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);
		final String A = sc.next();
		sc.close();
		boolean control = true;

		for (int i = 0; i < A.length() / 2 && control != false; i++)
			control = A.charAt(i) == A.charAt(A.length() - (1 + i)) ? true : false;

		System.out.println(control ? "Yes" : "No");
	}
}
