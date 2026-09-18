import java.util.List;

public class Q23Top5Nums {
    public static void main(String[] args) {
        List<Integer> nums=List.of(25, 90, 10, 75, 60, 100, 45, 80, 55);

        nums.stream()
            .sorted((a,b)->b-a)
            .limit(5)
            .forEach(System.out::println);
    }
    
}
