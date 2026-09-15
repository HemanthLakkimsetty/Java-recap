import java.util.List;

public class Q8MulOfXByStreams {
    public static void main(String[] args) {
        List<Integer> nums =
        List.of(5, 10, 15, 20, 25);

        multipleOfX(nums, 2);
    }

    static void multipleOfX(List<Integer>nums,int x){
            nums.stream()
                    .filter(n->n%x==0)
                    .forEach(System.out::println);
    }
}
