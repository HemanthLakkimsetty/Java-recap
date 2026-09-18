
import java.util.*;
public class Q9RemoveDuplis {
    public static void main(String[] args) {
        List<Integer> ls=List.of(10, 20, 10, 30, 20, 40, 30);

        ls.stream().distinct()
                    .forEach(System.out::println);

        System.out.println(ls);
    }
    
}
