import java.util.List;

public class Q15SkipLimit {
    public static void main(String[] args) {
        List<Integer> nums=List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        nums.stream()
            .skip(3)
            .limit(3)
            .forEach(System.out::println);
    }
}
