import java.util.List;

public class Q4GreaterNums {
    public static void main(String[] args) {
        List<Integer> nums=List.of(12,20,74,46,94,50,62,54,45,65);

        greaterThanX(nums, 25);
        System.out.println();
        greaterThanX(nums, 45);
    }

    static void greaterThanX(List<Integer> nums,int x){
        nums.stream()
                    .filter(n->n > x)
                    .forEach(System.out::println);
    }
}
