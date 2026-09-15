import java.util.Arrays;

public class Q4ArraysStream {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        Arrays.stream(arr)
                .forEach(System.out::println);

    }
}
