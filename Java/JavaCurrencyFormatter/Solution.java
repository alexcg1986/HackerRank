import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final double PAYMENT = sc.nextDouble();
		sc.close();

		final String US = NumberFormat.getCurrencyInstance(Locale.US).format(PAYMENT);
		final String INDIA = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(PAYMENT);
		final String CHINA = NumberFormat.getCurrencyInstance(Locale.CHINA).format(PAYMENT);
		final String FRANCE = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(PAYMENT);

		System.out.println("US: " + US);
		System.out.println("India: " + INDIA);
		System.out.println("China: " + CHINA);
		System.out.println("France: " + FRANCE);
	}
}
