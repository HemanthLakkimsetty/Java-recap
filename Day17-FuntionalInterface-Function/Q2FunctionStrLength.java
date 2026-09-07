import java.util.function.Function;

public class Q2FunctionStrLength {
    public static void main(String[] args) {
        Function<String,Integer> strLength=str->str.length();

        System.out.println(strLength.apply("java"));
        System.out.println(strLength.apply("Progarmming"));
    }
}
