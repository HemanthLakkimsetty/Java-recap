import java.util.List;

public class Q2EvenByStreams {
    public static void main(String[] args) {
        List<Integer> nums=List.of(2,5,6,2,1,5,6,7,3,25,6);

        nums.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
