import java.util.*;
public class Q4ConvertNums {
    public static void main(String[] args) {
        List<Integer> nums=List.of(10, 20, 30, 40, 50);

        nums.stream()
            .map(x -> x*2)
            .forEach(System.out::println);
    }
}
