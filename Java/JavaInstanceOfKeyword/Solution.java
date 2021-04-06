import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class Solution {

	static String count(List<Object> myList) {
		int a = 0;
		int b = 0;
		int c = 0;

		for (Object obj : myList) {
			if (obj instanceof Student)
				a++;
			else if (obj instanceof Rockstar)
				b++;
			else
				c++;
		}
		return a + " " + b + " " + c;
	}

	public static void main(String[] args) {
		final List<Object> myList = new ArrayList<Object>();
		final Scanner sc = new Scanner(System.in);
		final int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String s = sc.next();
			if (s.equals("Student"))
				myList.add(new Student());
			if (s.equals("Rockstar"))
				myList.add(new Rockstar());
			if (s.equals("Hacker"))
				myList.add(new Hacker());
		}
		sc.close();
		System.out.println(count(myList));
	}
}