import java.util.stream.Stream;
public class Q8StreamIterateMethod {
    public static void main(String[] args) {
        Stream.iterate(1,x->x+1).limit(10).forEach(System.out::println);

        //java 9 ver

            Stream.iterate(10,n -> n <= 50,
                n -> n + 10
            )
            .forEach(System.out::println);
    }
    
}
