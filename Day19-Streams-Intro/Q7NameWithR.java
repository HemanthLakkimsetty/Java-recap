import java.util.List;

public class Q7NameWithR {
    public static void main(String[] args) {
        List<String> names=List.of("Ravi", "Anil", "Kiran", "Raj", "Suresh");
        names.stream()
                    .filter(n->n.startsWith("R"))
                    .forEach(System.out::println);
    }
}
