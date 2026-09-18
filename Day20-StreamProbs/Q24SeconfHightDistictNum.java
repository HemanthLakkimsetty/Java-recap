import java.util.List;


public class Q24SeconfHightDistictNum {
    public static void main(String[] args) {
        List<Integer> nums=List.of(10, 50, 30, 50, 20, 40);

        nums.stream()
            .distinct()
            .sorted((a,b)->b-a)
            .limit(2)
            .skip(1)
            .forEach(System.out::print);
    }
    
}
