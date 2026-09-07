import java.util.Scanner;
import java.util.function.Predicate;

public class Q6OrMulConPredicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        Predicate<String> isEmpty=(x)->x.isEmpty();
        Predicate<String> getLength=(x)->x.length()>5;
        Predicate<String> startsWithJava=(x)->x.startsWith("Java");
        Predicate<String> conatainsSpecialChar=(x)->x.contains("@");

        System.out.println(isEmpty.or(getLength.or(startsWithJava.or(conatainsSpecialChar))).test(str));

        sc.close();
    }
}
