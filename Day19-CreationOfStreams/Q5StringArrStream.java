import java.util.*;
public class Q5StringArrStream {
    public static void main(String[] args) {
        String[] arr={"Hi","Hlo","Hrw","ifn"};

        Arrays.stream(arr)
                .forEach(System.out::println);
    }
}
