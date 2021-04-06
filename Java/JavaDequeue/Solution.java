import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> deque = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (i >= m) {
                int removed = deque.remove();
                if (map.get(removed) == 1)
                    map.remove(removed);
                else
                    map.put(removed, map.get(removed) - 1);
            }
            int num = sc.nextInt();
            deque.add(num);
            map.merge(num, 1, (newValue, oldValue) -> {
                return newValue + oldValue;
            }); // oldValue++ if present (newValue+=oldValue)
            max = max > map.size() ? max : map.size();
            if (max == m)
                break;
        }
        sc.close();
        System.out.println(max);
    }
}