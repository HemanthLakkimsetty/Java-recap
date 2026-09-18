import java.util.List;
import java.util.stream.Collectors;

public class Q22FilterMapCollect {
    public static void main(String[] args) {
        List<Integer> nums=List.of(5, 10, 15, 20, 25, 30);

        List<Integer>modifiedNums=nums.stream()
            .filter( x -> x % 2 == 0 )
            .map( x -> x * 2)
            .collect(Collectors.toList());

        System.out.println(modifiedNums);
    }
    
}
