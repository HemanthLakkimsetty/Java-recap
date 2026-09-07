import java.util.function.*;
public class Q1SupplierIntro{
    public static void main(String[] args) {
        Supplier<Integer> supplier=()->100;
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}