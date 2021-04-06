import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int N = Integer.valueOf(sc.nextLine());

		/* 
		 * Pattern breakdown
		 * *****************
		 * \b -> "Word boundary" used to match ONLY full words and not partial fragments. 
		 * \w -> Anything contained in these ranges [A-Za-z0-9_], usually a word.
		 * +  -> At least ONE of the preceding token.
		 * \s -> A whitespace.
		 * \1 -> A reference to the same tokens as the ones in the first capture group. A capture group is whatever that matches the tokens between "(" and ")".
		 * \b -> Again a word boundary to match full words instead of partial fragments. This time we're capturing (space+word).
		 * +  -> At least ONE of the preceding tokens; in our example n times.
		 * \  -> Added backslash to every scaped character for compatibility reasons.
		 * 
		 * https://regexr.com/ to test regular expressions
		 */
		for (int i = 0; i < N; i++) {
			final String REG_EX = "\\b(\\w+)(\\s+\\1\\b)+";
			String input = sc.nextLine();

			final Pattern p = Pattern.compile(REG_EX, Pattern.CASE_INSENSITIVE);
			final Matcher m = p.matcher(input);

			while (m.find()) {
				input = input.replaceAll(m.group(), m.group(1));
			}
			System.out.println(input);
		}
		sc.close();
	}
}