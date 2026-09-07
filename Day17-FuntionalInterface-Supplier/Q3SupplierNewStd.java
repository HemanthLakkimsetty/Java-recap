import java.util.function.Supplier;

public class Q3SupplierNewStd {
    public static void main(String[] args) {
        Supplier<Student> std=Student::createStudent;
        System.out.println(std.get());
    }
}
