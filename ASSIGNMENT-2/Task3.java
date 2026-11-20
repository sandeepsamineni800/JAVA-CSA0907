import java.util.*;

class Student {
    private final String regNo;
    private final String name;

    Student(String regNo, String name) {
        this.regNo = regNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Student))
            return false;

        Student s = (Student) o;
        return regNo.equals(s.regNo);
    }

    // Correct hashCode method
    @Override
    public int hashCode() {
        return regNo.hashCode();
    }

    public String toString() {
        return regNo + " " + name;
    }
}

public class Task3 {
    public static void main(String[] args) {

        Set<Student> present = new HashSet<>();

        present.add(new Student("192311001", "Arun"));
        present.add(new Student("192311002", "Divya"));
        present.add(new Student("192311001", "Arun"));

        System.out.println("Attendance Records:");

        for (Student s : present) {
            System.out.println(s);
        }

        System.out.println("Unique students: " + present.size());
    }
}
