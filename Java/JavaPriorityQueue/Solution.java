import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
    private Integer id;
    private String name;
    private Double cgpa;

    public Student(String name, Double cgpa, Integer id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getCgpa() {
        return this.cgpa;
    }

    @Override
    public int compareTo(Student o) {
        return this.getCgpa() < o.getCgpa() ? 1
                : this.getCgpa() > o.getCgpa() ? -1
                        : !this.getName().equals(o.getName()) ? this.getName().compareTo(o.getName())
                                : this.getId() < o.getId() ? -1 : this.getId() > o.getId() ? 1 : 0;
    }
}

class Priorities {

    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pQueue = new PriorityQueue<>();
        List<Student> list = new ArrayList<>();
        for (String event : events) {
            String[] elements = event.trim().split(" ");
            if ("ENTER".equals(elements[0]))
                pQueue.add(new Student(elements[1], Double.valueOf(elements[2]), Integer.valueOf(elements[3])));
            else {
                pQueue.poll(); // we expect pQueue to be empty at some points if SERVED is chained
            }
        }
        while (!pQueue.isEmpty())
            list.add(pQueue.remove()); // we control the empty case in the while so we can use remove instead of poll
        return list;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}