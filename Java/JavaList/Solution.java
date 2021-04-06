import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final List<Integer> listOfIntegers = new ArrayList<Integer>();

		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
			listOfIntegers.add(sc.nextInt());

		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			final Perform perform = "Insert".equals(sc.next()) ? (x) -> x.add(sc.nextInt(), sc.nextInt())
					: (x) -> x.remove(sc.nextInt());
			perform.action(listOfIntegers);
		}
		listOfIntegers.forEach(k -> System.out.print(k + " "));
		sc.close();
	}
}

interface Perform {
	void action(List<Integer> listOfIntegers);
}