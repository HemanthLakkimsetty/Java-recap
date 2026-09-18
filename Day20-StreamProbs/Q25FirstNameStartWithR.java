import java.util.List;

public class Q25FirstNameStartWithR {
    public static void main(String[] args) {
        List<String> names=List.of("Anil", "Ravi", "Kiran", "Rahul", "Suresh");

       names.stream()
            .filter( x -> x.startsWith("R"))
             .findFirst()
             .ifPresent(System.out::println);
    }
    
}
