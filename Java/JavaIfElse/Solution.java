import java.util.Scanner;

public class Solution {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		if (n % 2 != 0)
			System.out.println("Weird");
		else if (n >= 2 && n <= 5 || n > 20)
			System.out.println("Not Weird");
		else
			System.out.println("Weird");
		sc.close();
	}
}
