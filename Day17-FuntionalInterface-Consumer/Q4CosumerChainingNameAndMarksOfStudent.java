import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
class Q4CosumerChainingNameAndMarksOfStudent{
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", 85);
        Student s2 = new Student(2, "Bob", 92);
        Student s3 = new Student(3, "Charlie", 78);
        Student s4 = new Student(4, "Diana", 88);
        Student s5 = new Student(5, "Ethan", 95);
        Student s6 = new Student(6, "Fiona", 88);

        List<Student> stds=new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6));

        Consumer<Student> printmName=s->System.out.print(s.name+" ");
        Consumer<Student> printMarks=s->System.out.println(s.marks);

        stds.forEach(printMarks.andThen(printmName));
    }
}