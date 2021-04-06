import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final String N = sc.nextLine();
		sc.close();

		final BigInteger bigInt = new BigInteger(N);
		System.out.println(bigInt.isProbablePrime(1) ? "prime" : "not prime");
	}
}
