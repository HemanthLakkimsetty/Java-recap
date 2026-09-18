import java.util.List;

public class Q14DistinctSort {
    public static void main(String[] args) {
        List<Integer> nums=List.of(5, 2, 8, 2, 5, 10, 8, 3);

        nums.stream()
            .distinct()
            .sorted()
            .forEach(System.out::println);
    }
}
