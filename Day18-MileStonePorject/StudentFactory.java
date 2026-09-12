import java.util.function.Supplier;

public class StudentFactory {

    private static int id = 100;

    public static Student createStudent() {

        id++;

        return new Student(
                id,
                "Generated" + id,
                80
        );
    }

    public static Supplier<Student> getSupplier() {
        return StudentFactory::createStudent;
    }
}