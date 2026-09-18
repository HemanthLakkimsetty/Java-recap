import java.util.stream.Collectors;
import java.util.List;
public class Q36DeptMrkSortMap {
    public static void main(String[] args) {
        Student std=new Student();
        List<String>names=std.studentList().stream().filter(x->x.dept.equalsIgnoreCase("CSE") && x.marks > 75).sorted((a,b)->b.marks-a.marks).map(x->x.name).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
    
}
