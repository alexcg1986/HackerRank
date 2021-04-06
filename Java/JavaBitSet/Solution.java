import java.util.BitSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();

		final BitSet[] arrBitSets = { new BitSet(N), new BitSet(N) };

		for (int i = 0; i < M; i++) {
			switch (sc.next()) {
			case "AND":
				arrBitSets[sc.nextInt() - 1].and(arrBitSets[sc.nextInt() - 1]);
				break;
			case "OR":
				arrBitSets[sc.nextInt() - 1].or(arrBitSets[sc.nextInt() - 1]);
				break;
			case "XOR":
				arrBitSets[sc.nextInt() - 1].xor(arrBitSets[sc.nextInt() - 1]);
				break;
			case "FLIP":
				arrBitSets[sc.nextInt() - 1].flip(sc.nextInt());
				break;
			case "SET":
				arrBitSets[sc.nextInt() - 1].set(sc.nextInt());
				break;
			}
			System.out.println(arrBitSets[0].cardinality() + " " + arrBitSets[1].cardinality());
		}
		sc.close();
	}
}