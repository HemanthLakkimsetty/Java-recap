import java.util.stream.Stream;

public class Q7StreamGenerateMethod {
    public static void main(String[] args) {
        Stream.generate(()->5).limit(5)
        .forEach(System.out::println);

        Stream.generate(()->"java").limit(5).forEach(System.out::println);
    }

    
}
