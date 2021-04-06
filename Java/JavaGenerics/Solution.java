import java.lang.reflect.Method;

class Printer {
	void printArray(Object[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}

public class Solution {

	public static void main(String args[]) {
		final Printer myPrinter = new Printer();
		final Integer[] intArray = { 1, 2, 3 };
		final String[] stringArray = { "Hello", "World" };
		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);
		int count = 0;

		for (Method method : Printer.class.getDeclaredMethods()) {
			String name = method.getName();

			if (name.equals("printArray"))
				count++;
		}

		if (count > 1)
			System.out.println("Method overloading is not allowed!");
	}
}