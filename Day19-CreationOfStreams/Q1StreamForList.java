import java.util.List;

public class Q1StreamForList{
    public static void main(String[] args){
        List<Integer> list =
    List.of(10, 20, 30, 40, 50);

        list.stream()
            .forEach(System.out::println);
    }
}