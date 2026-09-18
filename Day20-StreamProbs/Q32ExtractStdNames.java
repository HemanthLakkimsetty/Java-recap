import java.util.List;
import java.util.stream.Collectors;

public class Q32ExtractStdNames {
    public static void main(String[] args) {
        Student std=new Student();

        List<Student> stds=std.studentList();

        List<String>stdsNames=stds.stream().filter(s -> s.marks > 75).map(x->x.name).collect(Collectors.toList());

        System.out.println(stdsNames);
    }
    
}
