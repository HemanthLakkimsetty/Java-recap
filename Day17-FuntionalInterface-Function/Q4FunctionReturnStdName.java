import java.util.List;
import java.util.function.Function;

public class Q4FunctionReturnStdName {
    public static void main(String[] args) {
        List<Student> stds=Student.getStudents();

        Function<Student,String> printStdName=s->s.name;
        for(Student s: stds){
            System.out.println(printStdName.apply(s));
        }
    }
}
