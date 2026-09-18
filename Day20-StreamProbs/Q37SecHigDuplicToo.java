import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Q37SecHigDuplicToo {
    public static void main(String[] args) {
        Student std=new Student();
        List<Integer>marks=std.studentList()
                .stream()
                .map(x->x.marks)
                .distinct()
                .sorted(Comparator.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());


        int secondHighestMarks=marks.get(0);

        std.studentList()
            .stream()
            .filter(x->x.marks==secondHighestMarks)
            .findFirst()
            .ifPresentOrElse(
                x->System.out.println(x.name),
                ()->System.out.println("no second Highest Marks")
            );
    }
    
}
