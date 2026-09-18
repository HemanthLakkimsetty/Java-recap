import java.util.List;

public class Q28CountDistinct {
    public static void main(String[] args) {
        List<Integer> nums=List.of(1, 2, 3, 2, 4, 3, 5, 2);

        Long val1=nums.stream()
            .filter(x -> x > 2)
            .count();
        
        Long val2=nums.stream()
                    .distinct()
                    .filter(x -> x > 2)
                    .count();
        
        System.out.println(val1+"\nunique:"+val2);
    }
}
