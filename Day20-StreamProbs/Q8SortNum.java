import java.util.*;

public class Q8SortNum {
    public static void main(String[] args) {
        List<Integer> ls=List.of(50, 10, 40, 20, 30);

        ls.stream().sorted().forEach(System.out::println);
    }
}
