import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentRules {

    // PREDICATE
    public static Predicate<Student> marksAbove80 =
            s -> s.getMarks() >= 80;

    public static Predicate<Student> marksBelow70 =
            s -> s.getMarks() < 70;

    public static Predicate<Student> marksAbove90 =
            s -> s.getMarks() >= 90;

    public static Predicate<Student> nameStartsWithA =
            s -> s.getName()
                  .toUpperCase()
                  .startsWith("A");

    // FUNCTION
    public static Function<Student, String> getName =
            Student::getName;

    public static Function<Student, Integer> getMarks =
            Student::getMarks;

    public static Function<Student, String> getGrade =
            Student::getGrade;

    // CONSUMER
    public static Consumer<String> printString =
            System.out::println;

    public static Consumer<Integer> printInteger =
            System.out::println;
}