import java.io.*;
import java.util.*;

import java.lang.reflect.*;
import static java.lang.System.in;

class Prime {
    void checkPrime(int... values) {
        for (int i = 0; i < values.length; i++)
            if (isPrime(values[i]))
                System.out.print(values[i] + " ");
        System.out.println();
    }

    boolean isPrime(int number) {
        if (number <= 1) // must be greater than 1 by definition
            return false;
        else if (number == 2) // 2 itself is the only prime that is pair
            return true;
        else if (number % 2 == 0) // any pair number different to 2 can't be a prime
            return false;
        else {
            // If a number is not a prime, it can be factored into two factors a and b:
            // number = a * b
            // a and b can't be both greater than the square root of number, since
            // then the product a * b would be greater than sqrt(n) * sqrt(n). So in any
            // factorization of number, at least one of the factors must be smaller than the
            // square root of number, and if we can't find any factors less than or equal to
            // the square root, number must be a prime.
            for (int i = 3; i <= (int) Math.sqrt(number); i += 2)
                if (number % i == 0)
                    return false;
        }
        return true;
    }
}

public class Solution {

    public void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
