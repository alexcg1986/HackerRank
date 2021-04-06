import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final String A = sc.nextLine();
		final String B = sc.nextLine();
		sc.close();

		System.out.println(new BigInteger(A).add(new BigInteger(B)));
		System.out.println(new BigInteger(A).multiply(new BigInteger(B)));

	}
}
