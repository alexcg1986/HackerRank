import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println(sha256(sc.next()));
        sc.close();
    }

    private static String sha256(String input) {
        String sha = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.update(input.getBytes(), 0, input.length());
            sha = new BigInteger(1, digest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sha;
    }
}