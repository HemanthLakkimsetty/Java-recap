import java.util.List;

public class Q30ShortCircuitAnyMath {
    public static void main(String[] args) {
        List<Integer> nums=List.of(10, 20, 30, 40, 150, 60, 70);

        boolean listGreater100=nums.stream().anyMatch(x -> x > 100);

        System.out.println(listGreater100?"Numbers in list greater than 100" : "numbers in list not greater then 100");

    }
    
}
