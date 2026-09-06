import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " " + marks;
    }
}

public class Q8CustomSortWithLambda {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ravi", 85));
        students.add(new Student(2, "Sita", 72));
        students.add(new Student(3, "Kiran", 91));
        students.add(new Student(4, "Arjun", 65));
        students.add(new Student(5, "Priya", 88));
        students.add(new Student(6, "Rahul", 72));

        // 1. Sort by marks ascending
        students.sort((s1, s2) -> Integer.compare(s1.marks, s2.marks));
        System.out.println("Marks Ascending: " + students);

        // 2. Sort by marks descending
        students.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));
        System.out.println("Marks Descending: " + students);

        // 3. Sort by name alphabetically
        students.sort((s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("Name Alphabetical: " + students);

        // 4. Bonus: Marks descending, then name alphabetical
        students.sort((s1, s2) -> {
            int markCompare = Integer.compare(s2.marks, s1.marks);
            return (markCompare != 0) ? markCompare : s1.name.compareTo(s2.name);
        });
        System.out.println("Marks Desc + Name: " + students);
    }
}
