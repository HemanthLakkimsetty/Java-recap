import java.util.List;

public class Q31FilterStudent {
    public static void main(String[] args) {
        Student std=new Student();
        List<Student> stds=std.studentList();

        Long count=stds.stream().filter(x -> x.marks > 75).count();

        System.out.println("Total students who got more than 75 marks :"+count);

        stds.stream().filter(x -> x.marks > 75).forEach(System.out::println);


    }
    
}
