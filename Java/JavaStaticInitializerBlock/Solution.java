import java.util.Scanner;

class Solution {

	static final Scanner sc = new Scanner(System.in);
	static final int B = sc.nextInt();
	static final int H = sc.nextInt();
	static boolean flag = true;

	static {
		try {
			if (B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}