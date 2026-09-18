import java.util.Optional;
import java.util.List;

public class Q16FindMax {
    public static void main(String[] args) {
        List<Integer> nums=List.of(25, 80, 45, 10, 95, 60);

        Optional<Integer> max=nums.stream()
            .max((a,b)->a-b);

            System.out.print(max);
    }
    
}
