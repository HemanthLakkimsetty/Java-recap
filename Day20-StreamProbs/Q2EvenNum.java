import java.util.*;
public class Q2EvenNum {
    
    public static void main(String[] args) {
        List<Integer> nums=List.of(5, 10, 15, 20, 25, 30);
        nums.stream()
            .filter(x->x%2==0)
            .forEach(System.out::println);
    }
}
