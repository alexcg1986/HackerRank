import java.util.Scanner;

public class Solution {

	public static boolean canWin(int leap, int[] game) {
		if (game == null) {
			return false;
		}
		return isSolvable(leap, game, 0);
	}

	private static boolean isSolvable(int leap, int[] game, int i) {

		if (i >= game.length) {
			return true;
		} else if (i < 0 || game[i] == 1) {
			return false;
		}

		game[i] = 1;

		return isSolvable(leap, game, i + leap) || isSolvable(leap, game, i + 1) || isSolvable(leap, game, i - 1);
	}

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int Q = sc.nextInt();

		for (int i = 0; i < Q; i++) {
			final int N = sc.nextInt();
			final int LEAP = sc.nextInt();

			final int[] game = new int[N];
			for (int j = 0; j < N; j++) {
				game[j] = sc.nextInt();
			}

			System.out.println((canWin(LEAP, game)) ? "YES" : "NO");
		}
		sc.close();
	}
}