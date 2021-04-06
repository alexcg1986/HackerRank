import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
	public static void main(String[] argh) {
		final Scanner sc = new Scanner(System.in);
		final int N = Integer.valueOf(sc.nextLine());
		final Map<String, Integer> personHashMap = new HashMap<String, Integer>();

		for (int i = 0; i < N; i++) {
			personHashMap.put(sc.nextLine(), Integer.valueOf(sc.nextLine()));
		}

		while (sc.hasNext()) {
			final String KEY = sc.nextLine();
			System.out.println(personHashMap.get(KEY) != null ? KEY + "=" + personHashMap.get(KEY) : "Not found");
		}
		sc.close();
	}
}
