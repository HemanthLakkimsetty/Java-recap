import java.util.Objects;
class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null or empty");
        }
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

@FunctionalInterface
interface StudentSelector {
    Student select(Student s1, Student s2);
}

public class Q7BestStudentFinder {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 85);
        Student s2 = new Student("Kiran", 91);

        StudentSelector selector = (st1, st2) -> {
            Objects.requireNonNull(st1, "First student cannot be null");
            Objects.requireNonNull(st2, "Second student cannot be null");
            return (st1.getMarks() >= st2.getMarks()) ? st1 : st2;
        };

        // Test case 1
        Student best = selector.select(s1, s2);
        System.out.println("Best student: " + best.getName()); // Expected: Kiran

        // Test case 2
        Student s3 = new Student("Anita", 95);
        Student s4 = new Student("Vijay", 88);
        System.out.println("Best student: " + selector.select(s3, s4).getName()); // Expected: Anita

        // Test case 3 (tie case)
        Student s5 = new Student("Rahul", 90);
        Student s6 = new Student("Priya", 90);
        System.out.println("Best student: " + selector.select(s5, s6).getName()); // Expected: Rahul (first one)
    }
}
