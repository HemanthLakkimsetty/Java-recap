import java.util.*;
import java.util.function.Function;
public class Q5FunctionGradingMarks {
    public static void main(String[] args) {
        List<Student> stds=Student.getStudents();

        Function<Student,String> grade=s->
        s.marks>90?"A+":
        s.marks>=80?"A":
        s.marks>=70?"B":
        s.marks>=60?"C":
        s.marks>=50?"D":
        "F";

        for(Student s: stds){
            System.out.println(s.name+"-"+grade.apply(s));
        }
    }
}
