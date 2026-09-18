import java.util.*;
public class Q13MapSortStr {
    public static void main(String[] args) {
        List<String> names=List.of("Ravi", "Anil", "Kiran", "Raj");

        names.stream()
             .map(x -> x.toUpperCase())
            //  .sorted()
            //  .sorted((a,b)->a.compareTo(b))
             .sorted((a,b)->b.compareTo(a))
             .forEach(System.out::println);
    }
    
}
