import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int I = Integer.valueOf(sc.nextLine());
		final double D = Double.valueOf(sc.nextLine());
		final String S = sc.nextLine();
		sc.close();

		System.out.println("String: " + S);
		System.out.println("Double: " + D);
		System.out.println("Int: " + I);
	}
}
