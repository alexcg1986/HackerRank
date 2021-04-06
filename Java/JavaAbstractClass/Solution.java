import java.util.Scanner;

abstract class Book {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}

}

class MyBook extends Book {

	@Override
	void setTitle(String s) {
		title = s;
	}
}

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final String TITLE = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(TITLE);
		System.out.println("The title is: " + new_novel.getTitle());
		sc.close();

	}
}