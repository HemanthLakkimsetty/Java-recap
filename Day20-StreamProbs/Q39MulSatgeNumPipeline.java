import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q39MulSatgeNumPipeline {
    public static void main(String[] args) {
        List<Integer> nums=List.of(10, 15, 20, 20, 25, 30, 35, 35, 40, 45, 50);

        List<Integer>modifiedNums=nums.stream().distinct().filter(x->x>20).sorted(Comparator.reverseOrder()).skip(1).limit(3).map(x->x*10).collect(Collectors.toList());

        modifiedNums.forEach(System.out::println);
    }
    
}
