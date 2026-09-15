import java.util.stream.Stream;

public class Q6StreamOfMethod {
    public static void main(String[] args) {
    Stream.of("Java", "Python", "C++")
    .forEach(System.out::println);
    }
}
