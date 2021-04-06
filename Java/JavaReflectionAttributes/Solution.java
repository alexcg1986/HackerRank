import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

	public static void main(String[] args) {
		Student student = new Student();
		final ArrayList<String> methodList = new ArrayList<String>();

		final Method[] methods = student.getClass().getDeclaredMethods();

		Arrays.asList(methods).forEach(m -> methodList.add(m.getName().toString()));
		Collections.sort(methodList);

		methodList.forEach(System.out::println);
	}
}

class Student {
	private String name;
	private String id;
	private String email;

	public Student() {
		super();
	}

	public Student(String name, String id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", email=" + email + "]";
	}
}