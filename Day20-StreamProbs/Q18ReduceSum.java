import java.util.List;
import java.util.Optional;

public class Q18ReduceSum {
    public static void main(String[] args) {
        List<Integer> nums=List.of(10, 20, 30, 40, 50);
        Optional<Integer>sum=nums.stream().reduce((a,b)->a+b);

        System.out.println(sum);
    }
    
}
