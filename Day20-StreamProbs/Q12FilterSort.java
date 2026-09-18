import java.util.*;

public class Q12FilterSort {
    public static void main(String[] args) {
        List<Integer> nums=List.of(15, 40, 10, 35, 25, 50, 5);

        nums.stream()
            .filter(x -> x > 20)
            .sorted((a,b) -> b-a)
            .forEach(System.out::println);
        
    }
    
}
