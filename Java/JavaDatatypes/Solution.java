import java.util.Scanner;

class Solution {
	public static void main(String[] argh) {
		final Scanner sc = new Scanner(System.in);
		final int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			try {
				final long X = sc.nextLong();
				System.out.println(X + " can be fitted in:");
				if (X >= Byte.MIN_VALUE && X <= Byte.MAX_VALUE)
					System.out.println("* byte");
				if (X >= Short.MIN_VALUE && X <= Short.MAX_VALUE)
					System.out.println("* short");
				if (X >= Integer.MIN_VALUE && X <= Integer.MAX_VALUE)
					System.out.println("* int");
				System.out.println("* long");
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
		}
		sc.close();
	}
}
