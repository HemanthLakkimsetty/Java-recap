import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentProcessor {

    public static <T, R> void process(
            List<T> data,
            Predicate<T> condition,
            Function<T, R> mapper,
            Consumer<R> action) {

        for (T item : data) {

            if (condition.test(item)) {

                R result = mapper.apply(item);

                action.accept(result);
            }
        }
    }
}