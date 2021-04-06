import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final String S = sc.nextLine().trim();
		sc.close();

		if (S.length() <= 400000 && !"".equals(S)) {
			final String[] arr = S.split("[ !,?._'@]+");
			System.out.println(arr.length);
			for (int i = 0; i < arr.length; i++)
				System.out.println(arr[i]);
		} else
			System.out.println("0");
	}
}
