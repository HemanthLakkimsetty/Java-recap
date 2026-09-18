import java.util.Optional;
import java.util.List;

public class Q17FindMin {
    public static void main(String[] args) {
        List<Integer> nums=List.of(25, 80, 45, 10, 95, 60);

        Optional<Integer>min=nums.stream().min((a,b)->a-b);

        System.out.println(min);
    }
    
}
