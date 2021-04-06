import java.util.Scanner;
// Other imports are forbidden

public class Solution {
	// Standar approach would be sort and compare both strings. This is an
	// alternative method due to the restrictions.
	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length())
			return false;

		a = a.toLowerCase();
		b = b.toLowerCase();

		for (int i = 0; i < a.length(); i++) {
			if (b.charAt(0) == a.charAt(i)) {
				if (b.length() == 1) {
					return true;
				} else {
					b = b.substring(1);
					a = newString(a, i);
					i = -1;
				}
			}
		}
		return false;
	}

	public static String newString(String s, int i) {
		if (i == 0)
			s = s.substring(1);
		else if (i < s.length() - 1)
			s = s.substring(0, i) + s.substring(i + 1);
		else
			s = s.substring(0, i);
		return s;
	}

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);
		final String A = sc.next();
		final String B = sc.next();
		sc.close();
		boolean ret = isAnagram(A, B);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}