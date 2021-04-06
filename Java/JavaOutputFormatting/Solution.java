import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s = sc.next();
			final int X = sc.nextInt();

			while (s.length() < 15)
				s += " ";
			if (X < 100)
				s += "0";
			if (X < 10)
				s += "0";
			System.out.println(s + X);
		}
		System.out.println("================================");
		sc.close();
	}
}
