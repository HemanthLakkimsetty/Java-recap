import java.util.function.Function;

public class Q3FunctionStrUpperCase {
    public static void main(String[] args) {
        Function<String,String> strUpperCase=s->s.toUpperCase();
        System.out.println(strUpperCase.apply("hello java"));
    }
}
