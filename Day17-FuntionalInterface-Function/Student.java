import java.util.*;
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks;
    }

    static List<Student> getStudents() {
        return Arrays.asList(
            new Student("Ravi", 85),
            new Student("Rahul", 90),
            new Student("Priya", 95),
            new Student("Arun", 75),
            new Student("Sneha", 88)
        );
    }
}
