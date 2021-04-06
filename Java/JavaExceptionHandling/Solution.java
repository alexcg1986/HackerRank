import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (final Scanner sc = new Scanner(System.in)) {
			System.out.println(sc.nextInt() / sc.nextInt());
		} catch (InputMismatchException imex) {
			System.out.println(imex.getClass().getName());
		} catch (ArithmeticException aex) {
			System.out.println(aex);
		}
	}
}