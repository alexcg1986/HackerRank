import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Student implements Comparable<Student> {
	private int id;
	private String fName;
	private double cgpa;

	public Student() {
		super();
	}

	public Student(int id, String fName, double cgpa) {
		super();
		this.id = id;
		this.fName = fName;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", cgpa=" + cgpa + "]";
	}

	@Override
	public int compareTo(Student o) {
		return o.getCgpa() != this.getCgpa() ? (o.getCgpa() > this.getCgpa() ? 1 : -1)
				: this.getfName().compareTo(o.getfName()) != 0 ? this.getfName().compareTo(o.getfName())
						: this.getId() - o.getId();
	}

}

public class Solution {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		final int TEST_CASES = sc.nextInt();

		final List<Student> studentList = new ArrayList<Student>();
		for (int i = 0; i < TEST_CASES; i++) {
			studentList.add(new Student(sc.nextInt(), sc.next(), sc.nextDouble()));
		}
		sc.close();
		Collections.sort(studentList);

		studentList.forEach(student -> System.out.println(student.getfName()));
	}
}
