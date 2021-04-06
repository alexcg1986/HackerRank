import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Result {
	public static String findDay(int month, int day, int year) {
		final String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		final Calendar calendar = new GregorianCalendar(year, month - 1, day);
		return weekDays[calendar.get(Calendar.DAY_OF_WEEK) - 1].toUpperCase();
	}
}

public class Solution {
	public static void main(String[] args) throws IOException {
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		final String[] firstMultipleInput = br.readLine().replaceAll("\\s+$", "").split(" ");

		final int MONTH = Integer.parseInt(firstMultipleInput[0]);

		final int DAY = Integer.parseInt(firstMultipleInput[1]);

		final int YEAR = Integer.parseInt(firstMultipleInput[2]);

		final String RES = Result.findDay(MONTH, DAY, YEAR);

		bw.write(RES);
		bw.newLine();

		br.close();
		bw.close();
	}
}
