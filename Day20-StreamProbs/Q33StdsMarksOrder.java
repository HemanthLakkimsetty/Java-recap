import java.util.stream.Collectors;
import java.util.List;
public class Q33StdsMarksOrder {
    public static void main(String[] args) {
        Student std=new Student();
        List<Student> stds=std.studentList();
        stds.stream().sorted((a,b) ->b.marks -  a.marks).forEach(System.out::println);
        //highest marks
        System.out.println("\nHighest Score student details: ");
        stds.stream().max((a,b)->a.marks-b.marks).map(x->x).ifPresent(System.out::print);
        //Top 3 scored Student
        System.out.println("\nTop 3 scored Student: ");
        List<Student> top3=stds.stream().sorted((a,b)->b.marks - a.marks).limit(3).collect(Collectors.toList());
        System.out.println(top3);

        //
    }
    
}
