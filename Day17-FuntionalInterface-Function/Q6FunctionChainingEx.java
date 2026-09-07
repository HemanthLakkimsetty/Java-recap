import java.util.function.Function;
public class Q6FunctionChainingEx {
    public static void main(String[] args) {
        Function<String,String> strTrim=(x)->x.trim();
        Function<String,String> strUpperCase=(x)->x.toUpperCase();
        Function<String,String> strLength=(x)->{String str=""+x.length();
            return str;
        };

        System.out.println(strTrim.andThen(strUpperCase).compose(strLength).apply("  Java  "));
    }
}
