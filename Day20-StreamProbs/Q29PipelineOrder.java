import java.util.List;
import java.util.stream.Collectors;

public class Q29PipelineOrder {
    public static void main(String[] args) {
        List<Integer> nums=List.of(5, 6, 10, 11, 15);

        List<Integer> l1=nums.stream().filter(x -> x>10).map(x -> x*2).collect(Collectors.toList());

        List<Integer> l2=nums.stream().map(x -> x*2).filter(x ->x>10).collect(Collectors.toList());

        System.out.println(l1+"\n"+l2);
    }
    
}
