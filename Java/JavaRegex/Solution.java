import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String ip = sc.next();
			System.out.println(ip.matches(new MyRegex().pattern));
		}
		sc.close();
	}
}

class MyRegex {
	String pattern = "^((25[0-5]|(2[0-4]|1[0-9]|[1-9]|)[0-9])(\\.(?!$)|$)){4}$";

	public MyRegex() {
		super();
	}
}
