import java.util.*;
public class Q3numGreat50 {
    public static void main(String[] args) {
        List<Integer> nums=List.of(20, 55, 40, 75, 90, 35);

        nums.stream()
            .filter(x -> x>50)
            .forEach(System.out::println);
    }
}
