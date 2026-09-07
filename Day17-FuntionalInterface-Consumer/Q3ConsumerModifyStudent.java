import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;

public class Q3ConsumerModifyStudent {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", 85);
        Student s2 = new Student(2, "Bob", 92);
        Student s3 = new Student(3, "Charlie", 78);
        Student s4 = new Student(4, "Diana", 88);
        Student s5 = new Student(5, "Ethan", 95);
        Student s6 = new Student(6, "Fiona", 88);

        List<Student> stds=new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6));
        System.out.println("Before: ");
        stds.forEach(s->System.out.println(s));
        
        Consumer<Student> marksUpdate=(s)->s.marks+=5;
        stds.forEach(marksUpdate);

        System.out.println("\nAfter:");
        stds.forEach(s->System.out.println(s));
    }
}
