import java.util.*;
public class Q2SetStream {
    public static void main(String[] args) {
        Set<Integer> set=Set.of(1,2,3,4,5);

        set.stream()
            .forEach(System.out::println);
    }
}
