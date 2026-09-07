import java.util.*;
import java.util.function.*;

public class Q4PosNegZerPredicate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        Predicate<Integer> isPos = (x) -> x > 0;
        Predicate<Integer> isNeg = (x) -> x < 0;
        Predicate<Integer> isZer = (x) -> x==0;

        System.out.println("Positive: "+isPos.test(n1));
        System.out.println("Negitive: "+isNeg.test(n2));
        System.out.println("Zero: "+isZer.test(n3));
        sc.close();
    }
}