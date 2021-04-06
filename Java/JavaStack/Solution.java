import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {

        final HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        final Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            final String S = sc.next();
            System.out.println(isBalanced(S, map) ? "true" : "false");
        }
        sc.close();
    }

    private static boolean isBalanced(String S, HashMap<Character, Character> map) {
        if ((S.length() % 2) != 0) {
            return false;
        }

        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < S.length(); i++) {
            if (map.containsKey(S.charAt(i))) {
                deque.push(S.charAt(i));
            } else if (deque.isEmpty() || S.charAt(i) != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }
}