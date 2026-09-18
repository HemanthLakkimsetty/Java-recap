
import java.util.*;

public class Q5ConStr {
    public static void main(String[] args) {
        List<String> ls=List.of("java", "python", "spring", "sql");

        ls.stream()
            .map(x -> x.toUpperCase())
            .forEach(System.out::println);
    }
    
}
