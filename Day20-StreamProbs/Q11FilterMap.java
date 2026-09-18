import java.util.*;

public class Q11FilterMap {
    public static void main(String[] args) {
        List<Integer> nums=List.of(5, 10, 15, 20, 25, 30);

        nums.stream()
            .filter(x -> x%2 == 0)
            .map(x -> x*10 )
            .forEach(System.out::println);

    }
    
}
