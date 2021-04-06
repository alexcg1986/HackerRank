import java.util.*;
import java.security.*;

public class Solution {
	public static void main(String[] args) {

		DoNotTerminate.forbidExit();

		try {
			final Scanner sc = new Scanner(System.in);
			final int N = sc.nextInt();
			sc.close();
			final String S = String.valueOf(N);

			if (N == Integer.parseInt(S)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}

class DoNotTerminate {

	public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1;
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}
