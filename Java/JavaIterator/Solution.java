import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution {

//	static Iterator<Object> func(List<Object> myList) {
//		final Iterator<Object> it = myList.iterator();
//		while (it.hasNext()) {
//			final Object element = it.next();
//			if (element instanceof String)
//				break;
//		}
//		return it;
//	}

	public static void main(String[] args) {
		final List<Object> myList = new ArrayList<Object>();
		final Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		for (int i = 0; i < N; i++) {
			myList.add(sc.nextInt());
		}

		myList.add("###");
		for (int i = 0; i < M; i++) {
			myList.add(sc.next());
		}
//
//		final Iterator<Object> it = func(myList);
//		while (it.hasNext()) {
//			final Object element = it.next();
//			System.out.println((String) element);
//		}

		Iterator<Object> it = myList.iterator();
		while (it.hasNext()) {
			if (it.next() instanceof String)
				break;
		}
		sc.close();
		it.forEachRemaining(System.out::println);
	}
}
