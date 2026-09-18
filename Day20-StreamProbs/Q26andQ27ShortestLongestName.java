import java.util.List;

public class Q26andQ27ShortestLongestName {
    public static void main(String[] args) {
        List<String> names=List.of("Ravi", "Alexander", "Kiran", "Suresh", "Raj");

        // names.stream()
        //      .sorted((a,b) -> b.length()-a.length())
        //      .limit(1)
        //      .forEach(System.out::print);

             names.stream().min((a,b)->a.length()-b.length()).ifPresent(System.out::println);
    }
    
}
