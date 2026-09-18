import java.util.List;
import java.util.stream.Collectors;

public class Q40MasterStudentPipeline {
    public static void main(String[] args) {
        Student std=new Student();
        List<String>names=std.studentList().stream().filter(x->x.dept.equalsIgnoreCase("CSE") && x.marks>70).sorted((a,b)->b.marks-a.marks).limit(3).map(x->x.name.toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
    
}
