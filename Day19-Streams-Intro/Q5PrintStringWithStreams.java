import java.util.List;

public class Q5PrintStringWithStreams {
    public static void main(String[] args) {
        List<String> names =
        List.of("Ravi", "Anil", "Kiran", "Raj", "Suresh");

        names.stream()
                    .forEach(System.out::println);
    }
}
